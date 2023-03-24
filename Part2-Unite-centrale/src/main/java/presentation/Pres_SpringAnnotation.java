package presentation;

import metier.UniteCentrale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pres_SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext springContext=new AnnotationConfigApplicationContext("dao","metier");
        UniteCentrale uc=springContext.getBean(UniteCentrale.class);
        uc.printData("Hello");
        System.out.println(uc.readData());
    }
}
