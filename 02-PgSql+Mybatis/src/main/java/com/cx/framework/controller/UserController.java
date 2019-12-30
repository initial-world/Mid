package com.cx.framework.controller;

import com.cx.framework.domain.User;
import com.cx.framework.service.UserService;
import com.cx.framework.utils.JsonUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Descrption springboot mybatis pgSql 整合测试
 * @Author chenxin
 * @Date 20190717
 */
@RestController
@Api(value = "swagger测试")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "hello测试", notes = "this is notes")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "query", name = "Id", value = "用户Id", required = true, dataType = "Integer")
    })
    @GetMapping("/hello")
    public void sayHello(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        User user = userService.getUser();
        response.getWriter().write(JsonUtils.getBeanToJson(user));
        response.getWriter().close();
    }


    @GetMapping("/bye")
    public String sayBye() {
        return "bye";
    }
}
