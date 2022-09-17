package com.ernesto.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Entering sayHello() method from MyController.java");

        return "Hello, world!";
    }
}
