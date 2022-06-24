package learn.config.collections;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try {
            
            ApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
            Student std1 = (Student) context.getBean("Subash");
            //Student std2 = (Student) context.getBean("Sita");
            //Student std3= (Student) context.getBean("Durgesh");

            System.out.println(std1);
            //System.out.println(std2);
            //System.out.println(std3);
        }
        catch (Exception e){
            System.out.println("error happened "+e);

        }
    }
}
