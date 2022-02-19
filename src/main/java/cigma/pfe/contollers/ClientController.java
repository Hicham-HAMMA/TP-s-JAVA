package cigma.pfe.contollers;

import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("ctrl")
public class ClientController {


    @Autowired
    private ClientService clientService;



    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with clientService param....");
        this.clientService = clientService;
    }

    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }

    public ClientController() {
        System.out.println("Call ClientController ....");
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
    }

