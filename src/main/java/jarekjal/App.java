package jarekjal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my_data");
        EntityManager em = emf.createEntityManager();
        // get all messages
        List messages = em.createNamedQuery("getMessages").getResultList();
        for(Object obj : messages){
            Message message = (Message) obj;
            System.out.println(message);
        }
        // get message with id = 1
        Message mes= em.find(Message.class, 1);
        System.out.println(mes);

    }
}
