package tsi.ensg.jee.tp2.simple;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJava implements Questions {
    @Override
    public List<String> questions() {
        List<String> questionsjava = new ArrayList<>();
        questionsjava.add("Question 1 : questionsjava");
        questionsjava.add("Question 2 : questionsjava");
        return questionsjava;
    }

}
