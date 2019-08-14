package springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Descrption TODO
 * @Author chenxin
 * @Date 2019/8/14
 * @Time 14:52
 */
@FeignClient(value = "service-hi")
@Service
public interface FeignTestService {
    @GetMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name")String name);
}
