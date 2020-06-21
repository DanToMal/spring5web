package com.malyszdan.diexamples;

import com.malyszdan.diexamples.controllers.ConstructorInjectedController;
import com.malyszdan.diexamples.controllers.I18nController;
import com.malyszdan.diexamples.controllers.MyController;
import com.malyszdan.diexamples.controllers.PropertyInjectedController;
import com.malyszdan.diexamples.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExamplesApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(DiExamplesApplication.class, args);

    I18nController i18nController = (I18nController) context.getBean("i18nController");

    String s = i18nController.sayHelloWorld();
    System.out.println(s);

    MyController myController = (MyController) context.getBean("myController");
    String greeting = myController.sayHello();
    System.out.println(greeting);

    ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context
        .getBean("constructorInjectedController");

    System.out.println(constructorInjectedController.getGreeting());
    PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context
        .getBean("propertyInjectedController");

    System.out.println(propertyInjectedController.getGreeting());

    SetterInjectedController setterInjectedController = (SetterInjectedController) context
        .getBean("setterInjectedController");
    System.out.println(setterInjectedController.getGreeting());
  }

}
