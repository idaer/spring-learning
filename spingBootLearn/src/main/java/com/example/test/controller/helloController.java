package com.example.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {

    @RequestMapping("/one")//将该方法映射到对应的分域名下
    public String hello() {
        return "This is first request send by spring boot";
    }
    @RequestMapping("/two")//一个分域名可以存在多个域名
    public String bye() {
        return "fuck hyq";
    }


}
