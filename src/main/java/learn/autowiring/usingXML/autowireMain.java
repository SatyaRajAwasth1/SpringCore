package learn.autowiring.usingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowireMain {
    public static void main(String[] args) {
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("autowiringXMLConf.xml");
            Teacher tech1 = (Teacher) context.getBean("phyTeacher");
            System.out.println(tech1);
        }
        catch (Exception e){
            System.out.println("Error got to be held");
            e.printStackTrace();
        }
    }
}
