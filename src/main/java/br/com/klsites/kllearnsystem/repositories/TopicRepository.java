package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}