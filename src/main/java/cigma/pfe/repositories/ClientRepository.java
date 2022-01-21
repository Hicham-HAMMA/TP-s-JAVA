package cigma.pfe.repositories;

import cigma.pfe.models.Client;

import java.util.List;


public interface ClientRepository {
    boolean save(Client c);
    Client update(Client c);
    void deleteById(long idClient);
    Client findById(long idClient);
    List<Client> findAll();
}