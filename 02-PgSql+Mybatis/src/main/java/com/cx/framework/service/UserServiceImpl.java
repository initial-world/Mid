package com.cx.framework.service;

import com.cx.framework.dao.UserDao;
import com.cx.framework.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/7/26
 * @Time 17:35
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getUser() {
        return userDao.getUser();
    }
}