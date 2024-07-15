package com.blogs;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.blogs.services.ExampleService;

import java.util.Optional;

@SpringBootApplication
public class CronjobApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(CronjobApplication.class, args);
		System.out.println(System.getenv().toString());
		System.out.println(System.getenv("runcronjob"));
		Optional.ofNullable(System.getenv("runcronjob")).ifPresent(arg -> {
			System.out.println("if present ");
			if(arg.equals("true")){
				System.out.println("Inside the true condition");
				try(applicationContext){
					System.out.println("Trying to run cronjob");
					ExampleService exampleService = applicationContext.getBean(ExampleService.class);
					exampleService.cronfunction();

					System.out.println("cronjob finished");
				} catch (BeansException e){
					System.out.println("error getting bean somehow");
				}
				System.out.println("Exiting the container");
				System.exit(0);
			}
		});

	}

}
