package task4.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task4.Basket;

public class BasketApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(task4.a.BasketConfiguration.class);
        Basket basket = (Basket) context.getBean("basket");
        ((AnnotationConfigApplicationContext)context).close();
    }

}
