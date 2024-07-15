package com.blogs.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ExampleController {

    @GetMapping(path = "/hello")
    public String helloWorld() {
        return "Hello World";
    }
    
}
