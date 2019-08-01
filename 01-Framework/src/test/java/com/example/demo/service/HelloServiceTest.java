package com.example.demo.service;

import com.example.demo.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/7/30
 * @Time 15:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloServiceTest {
    @Autowired
    private HelloService helloService;

    @Test
    public void testConnect() {
        User user = new User();
        user = helloService.testConnect();
        //Assert.assertArrayEquals(helloService.testConnect().getName().toCharArray(),"cx".toCharArray());
        Assert.assertEquals(user.getAge(), 25);
    }
}