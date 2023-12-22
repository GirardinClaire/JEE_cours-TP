package tsi.ensg.jee.tp2.simple;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("config-simple.xml");

        QuestionsService questionsService =  applicationcontext.getBean("questionService", tsi.ensg.jee.tp2.simple.QuestionsService.class);
        for (int i = 0; i<6 ; i++) {
            System.out.println(questionsService.getQuestion());
        }

    }

}