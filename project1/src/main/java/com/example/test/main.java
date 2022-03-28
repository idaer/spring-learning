package com.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {

        //Create spring context by config File
        ApplicationContext context=new ClassPathXmlApplicationContext("sbean.xml");
        //Create helloWorld class by spring context
        helloWorld hello=context.getBean("hello",helloWorld.class);
        //running hello world
        hello.out();
    }
}
