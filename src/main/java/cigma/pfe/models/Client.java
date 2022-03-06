package cigma.pfe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;


@Entity(name = "Tclients")


@AllArgsConstructor

@Inheritance(strategy = InheritanceType.JOINED)

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column
    public String name;

    public Client(String name) {
        this.name = name;
    }


    public Client() {
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