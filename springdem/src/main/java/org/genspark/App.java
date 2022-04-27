package org.genspark;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    //Use XML to configure the spring container to achieve DI for the above code,
    // later use Java Annotations and Java Configuration methods.
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Springdemm.xml");

        Student S = (Student) context.getBean("S");

        S.getId();
        S.getName();
        S.getAdd();
        S.getPh();

    }
}
