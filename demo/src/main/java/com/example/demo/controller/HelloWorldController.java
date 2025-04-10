package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
    
    @GetMapping("/")
    public String HelloWorld() {
        return "Hello World";
    }

    @GetMapping("/hello")
    public String HelloWorld2() {
        return "Hello World2";
    }
}
