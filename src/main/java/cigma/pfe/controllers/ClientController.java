package cigma.pfe.controllers;

import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("ctrl")
public class ClientController {


    @Autowired
    private ClientService clientService;



    public Client save(Client c ){
        return clientService.save(c);
    }


    public void modify(Client c){
        clientService.modify(c);
    }
    public void removeById(long id){
        clientService.removeById(id);
    }
    public Client getById(long id){
        return clientService.getById(id);
    }

    public List<Client> getAll(){
        return clientService.getAll();

    }
    public List<Client> findByNameC(String nom){
        return clientService.findByNameS(nom);

    }
    }

