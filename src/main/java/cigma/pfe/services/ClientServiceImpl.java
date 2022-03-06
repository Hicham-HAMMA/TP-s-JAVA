// La classe d’implémentation de l’interface Client Service
package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service

public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository ;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
    }

    @Transactional
    public Client modify(Client c) {
        return null;
    }

    @Transactional
    public void removeById(long id) {
        clientRepository.deleteById(id);
    }

    @Transactional
    public Client getById(long id) {
        return clientRepository.findById(id).get();
    }

    @Transactional
    public List<Client> getAll() {
        return (List<Client>) clientRepository.findAll();
    }
    public List<Client> findByNameS(String nom) {
        return (List<Client>) clientRepository.findByName(nom);

    }
    
}