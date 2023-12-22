package tsi.ensg.jee.onlineshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        OnlineShop onlineshop = context.getBean(OnlineShop.class);
        onlineshop.printDescription();
    }

}
