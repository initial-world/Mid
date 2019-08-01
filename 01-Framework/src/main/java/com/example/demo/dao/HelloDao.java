package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/7/26
 * @Time 17:38
 */

@Mapper
public interface HelloDao {
    User testConnect();
}
