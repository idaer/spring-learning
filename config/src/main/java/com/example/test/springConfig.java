package com.example.test;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.example.test")
@EnableAspectJAutoProxy  //使能 @AspectJ 支持
public class springConfig {
    public springConfig() {
        System.out.println("已开启@configuration注解配置...");
    }

    @Bean
    @Scope("prototype")
    public User user() {
        return new User();
    }
}
