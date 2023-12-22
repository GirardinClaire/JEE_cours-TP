package tsi.ensg.jee.tp2.exo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationcontext = new ClassPathXmlApplicationContext("config-library.xml");

        Library library =  applicationcontext.getBean("library", Library.class);
        System.out.println(library.toString());

    }

}