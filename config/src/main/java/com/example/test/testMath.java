package com.example.test;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("testMath")
public class testMath {

    public void add(int x, int y) {
        System.out.println("answer is "+(x+y));
    }


}
