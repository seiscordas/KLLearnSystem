package br.com.klsites.kllearnsystem.entities.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.web.SecurityFilterChain;

import java.util.Arrays;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Autowired
    private Environment environment;
    @Autowired
    private JwtTokenStore jwtTokenStore;
    private static final String[] PUBLIC = {"/oauth/token", "/h2-console/**"};
    private static final String[] TEST = {"/actuator/**"};
    //private static final String[] OPERATOR_OR_ADMIN = {"/products/**", "/categories/**"};
    // private static final String[] ADMIN = {"/users/**"};

    @Bean
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        resources.tokenStore(jwtTokenStore);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        h2ReleaseAccess(http);

        http.authorizeHttpRequests((authorize) -> authorize
                .requestMatchers(PUBLIC).permitAll()
                .requestMatchers(TEST).permitAll()
                //.requestMatchers(HttpMethod.GET, OPERATOR_OR_ADMIN).permitAll()
                //.requestMatchers(OPERATOR_OR_ADMIN).hasAnyRole("OPERATOR", "ADMIN")
                //.requestMatchers(ADMIN).hasAnyRole("ADMIN")
                .anyRequest().authenticated()
        );
        return http.build();
    }
    private void h2ReleaseAccess(HttpSecurity http) throws Exception {
        if (Arrays.asList(environment.getActiveProfiles()).contains("test")){
            http.headers().frameOptions().disable();
        }
    }
}
