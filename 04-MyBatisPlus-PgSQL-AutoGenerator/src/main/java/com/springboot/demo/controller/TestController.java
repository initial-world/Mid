package com.springboot.demo.controller;


import com.springboot.demo.service.ITestService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
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

    @GetMapping(value = "/{id}", produces = {"application/json"})
    public String selectList(
            @ApiParam(value = "noting", required = true) @PathVariable("id") String id) {

        return "ooook";
    }
}
