package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.springboot.demo.listener.*")
public class DemoApplication {
    public static void main(String[] args) {
        //SpringApplication springApplication = new SpringApplication(DemoApplication.class);
        //springApplication.addListeners(new RequestListener);
        SpringApplication.run(DemoApplication.class, args);
    }
}