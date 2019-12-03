package task4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Basket implements InitializingBean, DisposableBean {

    @Value("10")
    private int id;

    public Basket() {
    }

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
