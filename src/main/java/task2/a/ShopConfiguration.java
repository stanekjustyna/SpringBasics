package task2.a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import task2.Shop;

@Configuration
@ComponentScan("task2")
public class ShopConfiguration {

    @Bean(name="shopSingleton")
    public Shop getShop(){
        Shop shop = new Shop();
        shop.setName("myShop");
        return shop;
    }

    @Bean(name="shopPrototype")
    @Scope("prototype")
    public Shop getShopPrototype(){
        Shop s = new Shop();
        s.setName("Lidl");
        return s;
    }

}
