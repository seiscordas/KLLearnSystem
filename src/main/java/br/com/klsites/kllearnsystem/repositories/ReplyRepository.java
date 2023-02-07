package br.com.klsites.kllearnsystem.repositories;

import br.com.klsites.kllearnsystem.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}