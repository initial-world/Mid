package com.springboot.demo.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springboot.demo.entity.Test;
import com.springboot.demo.mapper.TestMapper;
import com.springboot.demo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author cx
 * @since 2019-08-12
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {
    @Autowired
    TestMapper testMapper;

    @Override
    public IPage<Test> selectTestList(Page page, Integer state) {
        return testMapper.selectTestList(page, state);
    }
}
