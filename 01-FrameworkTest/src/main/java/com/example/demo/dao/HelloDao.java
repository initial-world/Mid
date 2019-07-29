package com.example.demo.dao;

import com.example.demo.domain.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/7/26
 * @Time 17:38
 */

@Mapper
public interface HelloDao {
    Test testConnect();
}
