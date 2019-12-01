package task4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Basket implements InitializingBean, DisposableBean {

    private int id;

    public Basket(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void destroy() throws Exception {
        System.out.println("Destroying basket");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing basket");
        System.out.println("Id of basket is "+ id);
    }
}
