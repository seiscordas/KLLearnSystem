package br.com.klsites.kllearnsystem;

import br.com.klsites.kllearnsystem.entities.Enrollment;
import br.com.klsites.kllearnsystem.entities.Lesson;
import br.com.klsites.kllearnsystem.entities.enums.DeliverStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_deliver")
public class Deliver implements Serializable {
	@Serial
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String uri;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant moment;
	
	private DeliverStatus status;
	private String feedback;
	private Integer correctCount;
	
	@ManyToOne
	@JoinColumns({  
		@JoinColumn(name = "offer_id"), 
		@JoinColumn(name = "user_id") 
	})
	private Enrollment enrollment;
	
	@ManyToOne
	@JoinColumn(name = "lesson_id")
	private Lesson lesson;

	public Deliver(Long id, String uri, Instant moment, DeliverStatus status, String feedback, Integer correctCount,
                   Enrollment enrollment, Lesson lesson) {
		super();
		this.id = id;
		this.uri = uri;
		this.moment = moment;
		this.status = status;
		this.feedback = feedback;
		this.correctCount = correctCount;
		this.enrollment = enrollment;
		this.lesson = lesson;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Deliver deliver = (Deliver) o;

		return id.equals(deliver.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
