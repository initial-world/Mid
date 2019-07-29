package com.cx.framework.dao;

import com.cx.framework.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/7/29
 * @Time 15:46
 */
@Mapper
public interface UserDao {
    User getUser();
}
