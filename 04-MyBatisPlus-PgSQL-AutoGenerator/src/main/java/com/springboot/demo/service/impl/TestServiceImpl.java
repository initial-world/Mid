package com.springboot.demo.service.impl;

import com.springboot.demo.entity.Test;
import com.springboot.demo.mapper.TestMapper;
import com.springboot.demo.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cx
 * @since 2019-08-12
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
