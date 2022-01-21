// La classe d’implémentation de l’interface Client Service
package cigma.pfe.services;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;

import java.util.List;

public class ClientServiceImpl implements ClientService{
    ClientRepository clientRepository ;
    public ClientServiceImpl(ClientRepository clientRepository) {
        System.out.println("Call ClientServiceImpl with ClientRepository param....");
        this.clientRepository = clientRepository;
    }

    public void setClientRepository(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    //ClientRepository clientRepository = new ClientRepositoryImpl();
    @Override
    public boolean save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return clientRepository.save(c);
        }
    public ClientServiceImpl() {
        System.out.println("Call ClientServiceImpl ....");
    }
    @Override
    public Client modify(Client c) {
        return clientRepository.update(c);
    }
    @Override
    public void removeById(long id) {
        clientRepository.deleteById(id);
    }
    @Override
    public Client getById(long id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }
}