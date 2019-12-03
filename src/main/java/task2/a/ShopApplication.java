package task2.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import task2.Shop;

public class ShopApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(task2.a.ShopConfiguration.class);

        Shop shopSingleton = (Shop) context.getBean("shopSingleton");
        System.out.println("Name of the shop: " + shopSingleton.getName());

        Shop shopSPrototype = (Shop) context.getBean("shopPrototype");
        System.out.println("Name of the shop: " + shopSPrototype.getName());

        ((AnnotationConfigApplicationContext) context).close();
    }
}
