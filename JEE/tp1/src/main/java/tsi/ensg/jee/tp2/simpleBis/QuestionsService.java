package tsi.ensg.jee.tp2.simpleBis;

import java.util.List;
import java.util.Random;

public class QuestionsService {

    private Questions questions;

    public String getQuestion() {
        List<String> listquestions = this.questions.getlistquestions();
        int n = listquestions.size();
        Random random = new Random();
        int index = random.nextInt(n);
        return listquestions.get(index);
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }


}
