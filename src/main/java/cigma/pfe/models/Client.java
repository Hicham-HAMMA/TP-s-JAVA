package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

    @Entity(name = "Tclients")
    @Data

    @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="client_type")
//@DiscriminatorValue("client")
    public class Client {
        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        public long id;

        @Column
        public String name;

        public Client(String name) {
            this.name = name;
        }


        public Client() {
        }

        public Client(long id, String name) {
            this.id = id;
            this.name = name;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}