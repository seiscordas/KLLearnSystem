package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Course;
import br.com.klsites.kllearnsystem.entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepository extends JpaRepository<Lesson, Long> {
}