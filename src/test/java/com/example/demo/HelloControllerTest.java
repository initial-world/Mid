package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 20190717
 */
@RestController
public class HelloControllerTest {
    /**
     * @Descrption TODO
     * @Author chenxin
     * @param
     * @return java.lang.String
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello(){
        return "hello";
    }
}
