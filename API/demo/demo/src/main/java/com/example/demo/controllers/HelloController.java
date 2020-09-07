package com.example.demo.controllers;

import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "hello-controller")
public class HelloController {

    @Autowired
    HelloService service;

    @GetMapping(value = "/hello")
    public String returnHello() {
        return service.returnHello();
    }
}
