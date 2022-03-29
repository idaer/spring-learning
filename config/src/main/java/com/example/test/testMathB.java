package com.example.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class testMathB {

    @Before("execution(* com.example.test.testMath.*(..))")
    public void runAdd(JoinPoint join) {
        System.out.println("正在执行add方法前置..."+join);
    }

    @AfterReturning("execution(* com.example.test.testMath.*(..))")
    public void  afterAdd(JoinPoint point) {
        System.out.println("add方法执行结束..."+point);
    }

//    @Pointcut(value = "execution(* com.example.test.testMath.*(..))")
//    public void pointCut1() {
//        //应该是空函数体
//        //System.out.println("running");
//    }
//
//    @Pointcut(value = "execution(* com.example.test.testMath.*(..))")
//    public void pintCut2() {
//    }
}
