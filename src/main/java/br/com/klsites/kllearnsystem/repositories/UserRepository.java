package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}