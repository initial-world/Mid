package com.springccloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/7/31
 * @Time 10:15
 */

@RestController
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping(value = "/hi")
    public String hi() {
        return demoService.hiService();
    }
}
