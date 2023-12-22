package tsi.ensg.jee.onlineshop;

import org.springframework.stereotype.Component;

@Component
public class InsuranceTheft implements Insurance {

    @Override
    public String getDescription() {
        return "Theft insurance";
    }


}
