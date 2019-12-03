package task2;

import org.springframework.stereotype.Component;

@Component
public class Shop {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
