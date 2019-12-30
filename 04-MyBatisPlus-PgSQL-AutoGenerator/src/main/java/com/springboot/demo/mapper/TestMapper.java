package com.springboot.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.springboot.demo.entity.Test;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author cx
 * @since 2019-08-12
 */
public interface TestMapper extends BaseMapper<Test> {
    IPage<Test> selectTestList(Page page, Integer state);
}
