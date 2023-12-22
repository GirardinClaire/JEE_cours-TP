package tsi.ensg.jee.onlineshop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class OnlineShop {

    @Value("ShopShop")
    private String name;

    @Autowired
    private Set<Delivery> deliveryOptions;
    @Autowired
    private Set<Insurance> insurances;

    public void printDescription(){
        System.out.println(name);
        System.out.println("Delivery options");
        deliveryOptions.forEach(opt -> System.out.println("\t"+opt.getDescription()));
        System.out.println("Delivery options");
        insurances.forEach(insurance -> System.out.println("\t"+insurance.getDescription()));
    }

}