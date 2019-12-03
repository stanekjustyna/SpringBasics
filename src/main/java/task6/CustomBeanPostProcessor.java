package task6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import task4.Basket;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Basket){
            Basket basket = (Basket) bean;
            System.out.println("Bean with name: " + beanName + " was created but not yet initialized.");
            System.out.println("Basket id: " + basket.getId());
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Basket){
            Basket basket = (Basket) bean;
            System.out.println("Bean with name: " + beanName + " was created after initialization.");
            System.out.println("Basket id: " + basket.getId());
        }
        return bean;
    }
}
