package com.example.demo.service;

import com.example.demo.dao.HelloDao;
import com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/7/26
 * @Time 17:35
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Autowired
    private HelloDao helloDao;
    @Override
    public User testConnect() {
        System.out.println("here");
        return helloDao.testConnect();
    }
}
