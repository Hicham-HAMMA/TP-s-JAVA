package cigma.pfe;

import cigma.pfe.contollers.ClientController;
import cigma.pfe.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class MonApplication {
    public static void main(String[] args) {

        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl1 = new ClientController();
        Client client =new Client(1L,"testing");
        ctrl1.save(client);*/

        ApplicationContext context = new
                ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController)
                context.getBean("controller"); // controller est l'id dans le fichier Spring.xml

        Client client = new Client("ALAMI");
        ctrl.save(client);
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
    }
}