package com.springboot.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/8/21
 * @Time 19:32
 */
@WebListener
public class RequestListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent servletRequestEvent) {
        System.out.println("--Destroy");
    }

    @Override
    public void contextInitialized(ServletContextEvent servletRequestEvent) {
        System.out.println("--Init");
    }
}
