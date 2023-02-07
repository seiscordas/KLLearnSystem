package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}