package cigma.pfe;

import cigma.pfe.controllers.ClientController;
//import cigma.pfe.models.CarteFidelio;
import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.Client;

import cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MonApplication {
    public static void main(String[] args) {

        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl1 = new ClientController();
        Client client =new Client(1L,"testing");
        ctrl1.save(client);*/

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr= (ClientController) context.getBean("ctrl");
        FactureController fctrl= (FactureController) context.getBean("fctrl");

        fctrl.saveFacture(new Facture((new Date(2022-1900,02,15)),20));
        fctrl.saveFacture(new Facture(new Date(2021-1900,05,30),40));
        fctrl.modifierFacture(new Facture(new Date(2019,05,11),70));
        fctrl.getAllFactures(new Date(2022,02,15));
        fctrl.getFacturebyId(2);
        fctrl.findAllFactures();

        Client client1 = new Client("Omar");
        Client client2 = new Client("Said");
        Client client3 = new Client("Ahmed");
// Test1 => save 3 Clients
        client1=ctr.save(client1);
        client2=ctr.save(client2);
        client3=ctr.save(client3);
        ctr.findByNameC("Hicham");
        // Test2 => getAll Clients before modify and remove
        ctr.getAll().stream().forEach(i-> System.out.println(i));
// Test3 => getOne Client service
        System.out.println(ctr.getById(1));
// Test4 => modify Client service
        client1.setName("Hassan");
        ctr.modify(client1);
// Test5 => remove Client service
        ctr.removeById(2);
// Test getAll Client after modify and remove
        ctr.getAll().stream().forEach(i-> System.out.println(i));
    }
        /*
        ClientController ctrl = (ClientController) context.getBean("ctrl"); // controller est l'id dans le fichier Spring.xml

        //Client client = new Client("ALAMI");


       // ctrl.save(client);
        // Test save use case for three clients
        ctrl.save(new Client("OMAR"));
        ctrl.save(new Client("SIHAM"));
        ctrl.save(new Client("AHMED"));
        ctrl.save(new Client("FARAH"));
        // Test modify use case for client with id==1
        ctrl.modify(new Client(1,"Hicham HAMMA"));
        // Test remove use case for client with id==1
        //ctrl.removeById(1L);
        // Test find use case for client with id==1
        Client found = ctrl.getById(1L);
        ctrl.getAll();

        */
        //FACTURES
       /*
        FactureController ftrl = (FactureController) context.getBean("fcontroller");
        ftrl.create(new Facture(new Date(2002,05,29),20));
        ftrl.read();
        ftrl.delete(1);
        ftrl.update(new Facture(new Date(2002,06,28),40));
        */
/*
        ClientController ctrl1 = (ClientController) context.getBean("ctrl");

        ctrl1.save(new Client("HAMMA"));
        ctrl1.save(new ClientVip("HAMMA1","Preferences"));
        ctrl1.save(new ClientNormal("HAMMA2",2));
        //ctrl1.removeById(3l);

 */
    }
