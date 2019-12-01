package task3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task2.Shop;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;
import static junit.framework.TestCase.assertSame;

public class ShopAppTest2 {

    private ApplicationContext context;

    @Test
    public void shouldLoadContext(){
        context = new ClassPathXmlApplicationContext("task3/applicationShopContext3.xml");
        assertNotNull(context);
    }

    @Test
    public void shouldBeSingletonBean(){
        context = new ClassPathXmlApplicationContext("task3/applicationShopContext3.xml");
        Shop shop1 = (Shop) context.getBean("shop");
        Shop shop2 = (Shop) context.getBean("shop");
        assertSame(shop1, shop2);
    }

    @Test
    public void shouldBePrototypeBean(){
        context = new ClassPathXmlApplicationContext("task3/applicationShopContext3.xml");
        Shop shop1 = (Shop) context.getBean("shopPrototype");
        Shop shop2 = (Shop) context.getBean("shopPrototype");
        assertNotSame(shop1, shop2);
    }
}
