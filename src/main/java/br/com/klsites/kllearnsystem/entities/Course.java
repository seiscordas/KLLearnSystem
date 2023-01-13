package br.com.klsites.kllearnsystem.entities;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tb_course")
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String imgUri;
    private String imgGrayUri;

    @OneToMany(targetEntity=Offer.class, mappedBy="course", fetch=FetchType.EAGER)
    private List<Offer> offers = new ArrayList<>();

    public Course() {
    }
    public Course(Long id, String name, String imgUri, String imgGrayUri) {
        this.id = id;
        this.name = name;
        this.imgUri = imgUri;
        this.imgGrayUri = imgGrayUri;
    }
}
