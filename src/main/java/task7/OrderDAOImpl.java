package task7;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO{

    List<Order> orders;

    public List<Order> findOrders() {
        this.prepareOrders();
        return orders;
    }

    private void prepareOrders(){
        orders = new ArrayList<Order>();

        for(int i = 50; i <= 55; i++){
            Order o = new Order();
            o.setId(i);
            orders.add(o);
        }
    }
}
