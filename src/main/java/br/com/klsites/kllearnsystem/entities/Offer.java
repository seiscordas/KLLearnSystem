package br.com.klsites.kllearnsystem.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Data
@Entity
@Table(name = "tb_offer")
public class Offer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String edition;
    private Instant startMoment;
    private Instant endMoment;
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Offer() {
    }

    public Offer(Long id, String edition, Instant startMoment, Instant endMoment, Course course) {
        this.id = id;
        this.edition = edition;
        this.startMoment = startMoment;
        this.endMoment = endMoment;
        this.course = course;
    }
}
