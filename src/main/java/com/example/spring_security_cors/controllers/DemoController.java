package com.example.spring_security_cors.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    //@CrossOrigin("http://localhost:8080")  //not the best way
    public String demo(){
        return "demo";
    }

}
