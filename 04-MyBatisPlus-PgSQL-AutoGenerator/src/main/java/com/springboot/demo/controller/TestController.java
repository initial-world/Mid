package com.springboot.demo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.springboot.demo.service.ITestService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author cx
 * @since 2019-08-12
 */
@RestController
@RequestMapping("/demo/test")
public class TestController {
    @Autowired
    private ITestService iTestService;
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public String selectList(
            @ApiParam(value = "noting", required = true) @PathVariable("id") String id) {

        logger.debug("success");
        return JSONArray.parseArray(JSON.toJSONString(iTestService.list())).toString();
    }
//
//    @Autowired
//    private StringRedisTemplate str;
//
//    @GetMapping(value = "/putRedis")
//    public void put() {
//        str.opsForValue().set("test", "this is a test");
//    }
//
//    @GetMapping(value = "/getRedis")
//    public void get() {
//        str.opsForValue().get("test");
//    }

    @GetMapping(value = "/haha")
    public String haha() {
        return "hah";
    }


}
