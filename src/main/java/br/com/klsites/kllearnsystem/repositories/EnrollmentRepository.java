package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Enrollment;
import br.com.klsites.kllearnsystem.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
