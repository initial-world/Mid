package com.springboot.demo.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.demo.service.ITestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/8/20
 * @Time 21:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceImplTest {
    @Autowired
    ITestService itestService;

    @Test
    public void selectTestList() {
        System.out.println(itestService.getById(1));
        System.out.println(itestService.selectTestList(new Page(), 1).getSize());
    }
}