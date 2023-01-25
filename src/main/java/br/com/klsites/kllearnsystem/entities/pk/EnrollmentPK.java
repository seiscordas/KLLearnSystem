package br.com.klsites.kllearnsystem.entities.pk;

import br.com.klsites.kllearnsystem.entities.Offer;
import br.com.klsites.kllearnsystem.entities.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Embeddable
public class EnrollmentPK implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnrollmentPK that = (EnrollmentPK) o;

        if (!user.equals(that.user)) return false;
        return offer.equals(that.offer);
    }

    @Override
    public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + offer.hashCode();
        return result;
    }
}
