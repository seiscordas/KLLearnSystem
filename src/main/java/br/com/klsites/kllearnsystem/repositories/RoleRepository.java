package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}