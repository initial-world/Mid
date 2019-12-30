package com.example.demo.service;

import com.example.demo.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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

    @Test
    public void streamFilter(){
        List<User> l = new ArrayList();
        User user1 = new User();
        user1.setAge(20);
        user1.setName("a");
        user1.setId(1001);
        User user2 = new User();
        user1.setAge(20);
        user1.setName("b");
        user1.setId(1002);
        User user3 = new User();
        user1.setAge(30);
        user1.setName("c");
        user1.setId(1003);
        l.add(user1);
        l.add(user2);
        l.add(user3);
        List l2 = l.stream().filter(a -> a.getAge()==20).collect(Collectors.toList());
        System.out.println(l2);
    }

    @Test
    public void qqq() {
        User user1 = new User();
//        user1.setAge(1);
        User user2 = new User();
        user2.setId(2);
        User user3 = new User();
        user3.setId(7);
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Optional<User> optionalUser = list.stream().max(Comparator.comparingInt(User::getAge));
        System.out.println(optionalUser.get());
    }
}