package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(springConfig.class);

        testMath tm= (testMath) context.getBean("testMath");
        tm.add(1,2);
    }
}
