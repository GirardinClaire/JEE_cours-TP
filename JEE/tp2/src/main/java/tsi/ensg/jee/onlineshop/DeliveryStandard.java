package tsi.ensg.jee.onlineshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DeliveryStandard implements Delivery {
    @Value("12")
    // @Value(12)
    private String delay;

    @Override
    public String getDescription() {
        return "Standard delivery with a delay of "+ this.delay +" days";
    }


}
