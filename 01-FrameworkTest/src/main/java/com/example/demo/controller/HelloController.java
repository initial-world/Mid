package com.example.demo.controller;
import com.example.demo.Utils.JsonUtils;
import com.example.demo.domain.Test;
import com.example.demo.service.HelloService;
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
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public void sayHello(HttpServletRequest request, HttpServletResponse response)throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=UTF-8");
        Test test = helloService.testConnect();
        response.getWriter().write(JsonUtils.getBeanToJson(test));
        response.getWriter().close();
    }


    @GetMapping("/bye")
    public String sayBye(){return "bye";}
}
