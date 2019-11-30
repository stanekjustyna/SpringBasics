package javaconfiguration.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(javaconfiguration.task1.AppConfig.class);
        HelloWorld myMessage = (HelloWorld) context.getBean("helloWorld");
        myMessage.getMessage();
        ((AnnotationConfigApplicationContext) context).close();
    }
}
