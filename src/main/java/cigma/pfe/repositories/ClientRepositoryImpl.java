// La classe d’implémentation de l’interface ClientRepository
package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository{
    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Client save(Client c) {
        em.persist(c);
        return null;

    }
    @Transactional
    public Client update(Client c) {

        Client currentClient = em.find(Client.class,c.getId());
        currentClient.setName(c.getName());
        em.persist(currentClient);

        return null ;
    }
    @Transactional
    public void deleteById(long idClient) {
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);

    }

    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }

    public List<Client> findAll() {
        List<Client> ListClient = em.createQuery("select e from Client e").getResultList();
        return ListClient;
    }

    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepositoryImpl ....");
    }
}