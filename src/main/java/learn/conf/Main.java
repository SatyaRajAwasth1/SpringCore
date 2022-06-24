package learn.conf;
import  org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {

        System.out.println("this is spring jadu:---->");
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
            Address address1 = (Address) context.getBean("Ram");
            Address address2 = (Address) context.getBean("Sita");
            Address address3 = (Address) context.getBean("Durgesh");

            System.out.println(address1);
           System.out.println(address2);
          System.out.println(address3);
        }
       catch (Exception e){
           System.out.println("error happened "+e);

       }
       /*
       // using class path resource
        Resource r = new ClassPathResource("conf.xml");
        BeanFactory factory = new XmlBeanFactory(r);
        Address address1 = (Address) factory.getBean("Ram");
    */
    }
}
