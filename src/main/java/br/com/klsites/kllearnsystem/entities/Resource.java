package br.com.klsites.kllearnsystem.entities;

import br.com.klsites.kllearnsystem.entities.enums.ResourceType;
import lombok.*;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_resource")
public class Resource implements Serializable {
     @Serial
     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String title;
     private String description;
     private Integer position;
     private String imgUri;
     private ResourceType type;

     @ManyToOne
     @JoinColumn(name = "offer_id")
     private Offer offer;

     @OneToMany(mappedBy = "resource")
     private List<Section> sections = new ArrayList<>();

     public Resource(Long id, String title, String description, Integer position, String imgUri) {
          this.id = id;
          this.title = title;
          this.description = description;
          this.position = position;
          this.imgUri = imgUri;
     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;

          Resource resource = (Resource) o;

          return id.equals(resource.id);
     }

     @Override
     public int hashCode() {
          return id.hashCode();
     }
}
