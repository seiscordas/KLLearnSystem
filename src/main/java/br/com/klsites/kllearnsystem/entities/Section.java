package br.com.klsites.kllearnsystem.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_section")
public class Section implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Resource resource;

    @ManyToOne
    @JoinColumn(name = "prerequisite_id")
    private Section prerequisite;

    public Section() {
    }

    public Section(Long id, String title, String description, Integer position, String imgUri, Resource resource, Section prerequisite) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.position = position;
        this.imgUri = imgUri;
        this.resource = resource;
        this.prerequisite = prerequisite;
    }
}
