package com.example.test.controller;



import com.example.test.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
@CrossOrigin
public class helloController {

    @RequestMapping({"/one","three"})//将该方法映射到对应的分域名下
    //@RequestParam get属性命名和方法参数同名时，注解可以省略
    //参数require是否必须，defaultValue默认值
    public String hello(@RequestParam(value = "name",required = true,defaultValue = "zms") String name) {
        return "This is first request send by spring boot"+name;
    }
    @RequestMapping("/two")//一个分域名可以存在多个域名
    public User bye(@RequestBody User user) {
        System.out.println(user.getName());
        return user;
    }


}
