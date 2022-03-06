package cigma.pfe.models;

import lombok.Data;
import org.springframework.stereotype.Repository;

import javax.persistence.Embeddable;


@Embeddable
@Data
    public class ContactPerson {
        private String firstName;
        private String lastName;
        private String phone;
    }

