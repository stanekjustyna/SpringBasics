package task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("task2/applicationShopContext.xml");

        Shop shop = (Shop) context.getBean("shop");

        System.out.println(shop.getName());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
