package com.springccloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/7/31
 * @Time 10:15
 */
@Service
public class DemoService {
    @Autowired
    RestTemplate restTemplate;

    public String hiService() {
        return restTemplate.getForObject("http://SERVICE-HI/hi", String.class);
    }
}