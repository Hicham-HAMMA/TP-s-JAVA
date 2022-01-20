// La classe d’implémentation de l’interface ClientRepository
package cigma.pfe.repositories;

import cigma.pfe.models.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepositoryImpl ....");
    }
}