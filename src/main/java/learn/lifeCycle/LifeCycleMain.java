package learn.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleConf.xml");
        context.registerShutdownHook();
        /*
        System.out.println(context.getBean("bottleOfBeer"));



        //GETTING BEAN OF CLASS SALAD.JAVA
        System.out.println(context.getBean("saladForBeer"));*/
        Consumer c = (Consumer)  context.getBean("consumer");
        System.out.println(c);
    }


}
