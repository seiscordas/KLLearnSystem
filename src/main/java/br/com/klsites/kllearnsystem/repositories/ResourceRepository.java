package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource, Long> {
}