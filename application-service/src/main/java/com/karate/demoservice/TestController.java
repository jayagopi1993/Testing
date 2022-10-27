package com.karate.demoservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Test getData(){
        return new Test("Test Name");
    }

    @GetMapping("/api/hello")
    public String helloWorld(){
        return "Hello world!";
    }

    @GetMapping("/api/hello/{name}")
    public String helloWorld(String name){
        return "Hello "+name+"!";
    }

}
