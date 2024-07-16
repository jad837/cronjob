package com.blogs.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @Scheduled(cron = "* * * * * *")
    public void cronfunction() {
        System.out.println("Running cronjob");
    }

}
