package com.example.test.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class helloController {

    @RequestMapping("/one")//将该方法映射到对应的分域名下
    public String hello(@RequestParam("name") String name) {
        return "This is first request send by spring boot"+name;
    }
    @RequestMapping("/two")//一个分域名可以存在多个域名
    public String bye() {
        return "fuck hyq";
    }


}
