package task7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class OrderApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(OrderConfig.class);

        OrderService service = context.getBean(OrderService.class);

        List<Order> orders = service.findOrders();

        for(Order o : orders){
            System.out.print(o.getId() + " ");
        }

        ((AnnotationConfigApplicationContext) context).close();
    }
}
