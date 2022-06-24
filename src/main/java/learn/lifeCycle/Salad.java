package learn.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Salad implements InitializingBean, DisposableBean {
    // class where we will implement lifecycle method by implementing to interface
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " Salad{" +
                "price=" + price +
                '}'+" Enjoying salad with Beer";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Going to get a salad  -- init");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(" Salad finished.... jadiya haru destroyed it. ");
    }


}
