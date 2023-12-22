package tsi.ensg.jee.tp2.simpleBis;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJava implements Questions {

    List<String> listquestions = new ArrayList<>();

    @Override
    public List<String> getlistquestions() {
        return this.listquestions;
    }

    @Override
    public void setlistquestions(List<String> listQuestions) {
        this.listquestions = listQuestions;
    }


}
