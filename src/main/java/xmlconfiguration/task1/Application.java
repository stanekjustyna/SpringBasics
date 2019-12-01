package xmlconfiguration.task1;

import javaconfiguration.task1.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("xmlconfiguration.task1/XmlAppConfiguration.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.getMessage();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
