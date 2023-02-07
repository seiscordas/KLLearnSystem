package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Resource;
import br.com.klsites.kllearnsystem.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}