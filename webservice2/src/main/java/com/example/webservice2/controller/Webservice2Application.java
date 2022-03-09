package com.example.webservice2.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Webservice2Application {

    @Autowired
    @HystrixCommand(fallbackMethod = "defaultMessage")
    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    public String defaultMessage() {
        return "Salut !";
    }
}
