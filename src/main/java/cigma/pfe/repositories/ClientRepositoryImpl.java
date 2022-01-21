// La classe d’implémentation de l’interface ClientRepository
package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository{
            EntityManagerFactory emf=
            Persistence.createEntityManagerFactory("unit_clients");
            EntityManager em=emf.createEntityManager();
    @Override
    public boolean save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        return true;
        }

    @Override
    public Client update(Client c) {
        return null;
    }


    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepositoryImpl ....");
    }

    private ClientRepositoryImpl repository;
    public void setRepository(ClientRepositoryImpl repository) {
        this.repository = repository;
    }


    public Client modify(Client c) {
        return repository.update(c);
    }
    @Override
    public void deleteById(long idClient) {
        em.getTransaction().begin();
        Client clientInDataBase = em.find(Client.class,idClient);
        em.remove(clientInDataBase);
        em.getTransaction().commit();
    }
    @Override
    public Client findById(long idClient) {
        return em.find(Client.class,idClient);
    }

    @Override
    public List<Client> findAll() {
        List<Client> ListClient = em.createQuery("select e from TClients e").getResultList();
        return ListClient;
    }
}