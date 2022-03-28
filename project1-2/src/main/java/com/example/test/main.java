package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("sbean.xml");
        helloWorld hello=context.getBean("hello",helloWorld.class);
    }
}
