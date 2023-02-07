package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}