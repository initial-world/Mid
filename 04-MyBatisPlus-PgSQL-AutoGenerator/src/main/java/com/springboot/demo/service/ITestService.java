package com.springboot.demo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.springboot.demo.entity.Test;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author cx
 * @since 2019-08-12
 */
public interface ITestService extends IService<Test> {
    IPage<Test> selectTestList(Page page, Integer state);
}
