package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping
    public String testApp(){
        return "Hello World";
    }
    @GetMapping("/api")
    public String apiTest(){
        return "This is Return AIP";
    }

    @GetMapping("/test")
    public String objectTest(){
        return "This is Return Object Very Fast";
    }

}
