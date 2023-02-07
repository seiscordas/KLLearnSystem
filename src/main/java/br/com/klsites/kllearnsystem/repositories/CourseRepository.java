package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}