package tsi.ensg.jee.onlineshop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InsuranceReturn implements Insurance {

    @Value("only for members")
    // @Value("for all")
    private String type;

    @Override
    public String getDescription() {
        return "Return insurance " + type;
    }

}
