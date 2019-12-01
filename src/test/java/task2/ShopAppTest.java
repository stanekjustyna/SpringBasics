package task2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:task2/applicationShopContext.xml")
public class ShopAppTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void shouldCreateBean(){
        Shop shop = (Shop) applicationContext.getBean("shop");
        assertNotNull(shop);
        assertTrue(shop instanceof Shop);
        assertEquals("Stokrotka", shop.getName());
    }

    @Test
    public void shouldLoadContext(){
        assertNotNull(applicationContext);
    }



}
