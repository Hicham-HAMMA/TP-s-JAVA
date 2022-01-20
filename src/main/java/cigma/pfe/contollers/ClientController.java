package cigma.pfe.contollers;

import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;

public class ClientController {


    /*ClientService clientService = new ClientServiceImpl();
    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }

    public ClientController() {
        System.out.println("Call ClientController ....");
    }*/

    /*ClientService clientService;
    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }
    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    }
    public ClientController() {
        System.out.println("Call ClientController ....");
    }*/

    ClientService clientService;
    public ClientController(ClientService clientService) {
        System.out.println("Call ClientController with clientService param....");
        this.clientService = clientService;
    }
    public boolean save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);
    } public ClientController() {
        System.out.println("Call ClientController ....");
    }
}