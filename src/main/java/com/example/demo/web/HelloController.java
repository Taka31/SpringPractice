package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;

@RestController
public class HelloController {

    HelloService service;

    public HelloController(HelloService helloService){
        this.service=helloService;
    }

    @GetMapping("/bonjour")
    public String getBonjour(){
        return service.bonjour();
    }

    public HelloService getService(){
        return this.service;
    }

    
}
