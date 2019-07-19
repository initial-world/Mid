package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 20190717
 */
@RestController
public class HelloController {
    /**
     * @Descrption git测试
     * @Author chenxin
     * @param
     * @return java.lang.String
     */
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

}
