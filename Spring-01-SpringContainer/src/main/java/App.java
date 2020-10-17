import Interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        //try with Bean Factory
        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        //try with Application Context
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Mentor mentor = (Mentor)container.getBean("fullTimeMentor");
        mentor.createAccount();

        Mentor mentor1 = (Mentor)container.getBean("partTimeMentor");
        mentor1.createAccount();

        Mentor mentor2 = container.getBean("fullTimeMentor", Mentor.class);
        mentor2.createAccount();
    }
}
