package com.springboot.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.baomidou.mybatisplus.samples.quickstart.mapper")
public class DemoApplication {
    @Value("${pgsql.datasource.url}")
    private static String url;
    @Value("${pgsql.datasource.driver-class-name}")
    private static String driverClass;
    @Value("${pgsql.datasource.username}")
    private static String user;
    @Value("${pgsql.datasource.password}")
    private static String password;
    public static void main(String[] args) {
        System.out.println(url+""+driverClass+""+user+""+password);
        SpringApplication.run(DemoApplication.class, args);
    }

}
