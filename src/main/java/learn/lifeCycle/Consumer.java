package learn.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Consumer {
    // class to show implementation of life cycle methods using annotations.
    int n=1;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drinking started by: {" +
                "name='" + name + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println(name+" entered the party.. (init)");
    }
    @PreDestroy
    public void end(){
        System.out.println(name+" left the party (destroy)");
    }

    public Consumer() {
        super();
    }
}
