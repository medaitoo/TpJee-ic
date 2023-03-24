package presentation;

import metier.UniteCentrale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pres_SpringXML {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("configSpring.xml");
        UniteCentrale uc=context.getBean(UniteCentrale.class);
        uc.printData("Hello");
        System.out.println(uc.readData());
    }
}