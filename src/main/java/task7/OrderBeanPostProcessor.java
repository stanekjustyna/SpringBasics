package task7;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class OrderBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof OrderDAO) {
            OrderDAO orderDAO = (OrderDAO) bean;
            System.out.println("Bean with name "+beanName + " was initialized");
        } else if (bean instanceof OrderService){
            OrderService orderService = (OrderService) bean;
            System.out.println("Bean with name "+beanName + " was initialized");
        }
        return bean;
    }
}
