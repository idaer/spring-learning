package com.example.test.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class User {
    private String name;
    private int age;
    private  String gender;
    private  String email;
}
