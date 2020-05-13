package com.example.demo;

import com.example.demo.domain.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@MapperScan(value = "com.example.demo.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
//        LocalTime localTime = LocalTime.of(1,1,1);
//        System.out.println(localTime);
//        System.out.println(localTime.getHour());
//        System.out.println(localTime.getMinute());
//        System.out.println(localTime.getSecond());
 String a = "-10.01";
        System.out.println(Double.valueOf(a).longValue());
        System.out.println();
    }
}