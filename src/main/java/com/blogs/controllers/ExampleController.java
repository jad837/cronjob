package com.blogs.controllers;

import com.blogs.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    ExampleService exampleService;

    @PostMapping(path = "/cronjob")
    public void runCronJob(){
        exampleService.cronfunction();
    }
    
}
