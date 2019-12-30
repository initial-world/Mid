package springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/8/14
 * @Time 14:58
 */
@RestController
public class FeignTestController {
    @Autowired
    FeignTestService feignTestService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return feignTestService.sayHi(name);
    }
}
