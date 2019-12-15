package task7;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = OrderConfig.class)
public class OrderAppTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldCreateOrderDAOBean(){
        assertNotNull(context.getBean(OrderDAO.class));
        TestCase.assertTrue(context.getBean(OrderDAO.class) instanceof OrderDAO);
    }

    @Test
    public void shouldCreateOrderServiceBean(){
        assertNotNull(context.getBean(OrderService.class));
        TestCase.assertTrue(context.getBean(OrderService.class) instanceof OrderService);
    }

    @Test
    public void shouldOrdersBeReturned(){
        assertEquals(context.getBean(OrderDAO.class).findOrders(), context.getBean(OrderService.class).findOrders());
    }

}
