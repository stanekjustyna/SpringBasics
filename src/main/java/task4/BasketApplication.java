package task4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasketApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("task4/basketcontext.xml");

        Basket basket = (Basket) context.getBean("basket");

        ((ClassPathXmlApplicationContext) context).close();
    }
}
