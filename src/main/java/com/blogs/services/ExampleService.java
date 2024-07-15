package com.blogs.services;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    public int cronfunction() {
        System.out.println("Running cronjob");
        return 0;
    }
}
