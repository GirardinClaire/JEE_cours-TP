package tsi.ensg.jee.onlineshop;

import org.springframework.stereotype.Component;

@Component
public class DeliveryDrone implements Delivery {

    @Override
    public String getDescription() {
        return "Delivery by drone";
    }

}
