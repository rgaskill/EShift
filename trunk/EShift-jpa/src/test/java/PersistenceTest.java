import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.askill.eshift.user.User;

/**
 * Created by IntelliJ IDEA.
 * User: rgaskill
 * Date: 12/9/11
 * Time: 12:32 PM
 */
public class PersistenceTest {
    
    public static final void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/Config.xml");
        ctx.start();
        
        SessionFactory sessionFactory = (SessionFactory) ctx.getBean("mySessionFactory");
        Session session = sessionFactory.openSession();

        User user = (User) session.get(User.class,1);
        System.out.println(user);
    }
    
}
