package tsi.ensg.jee.tp2.simpleBis;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("config-simpleter.xml");

        QuestionsService questionsService =  applicationcontext.getBean("questionService", QuestionsService.class);
        for (int i = 0; i<10 ; i++) {
            System.out.println(questionsService.getQuestion());
        }

    }

}