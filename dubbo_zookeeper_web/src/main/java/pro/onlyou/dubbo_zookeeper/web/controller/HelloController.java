package pro.onlyou.dubbo_zookeeper.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.onlyou.dubbo_zookeeper.service.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    HelloService helloService;

    /**
     * 返回字符串
     * @return
     */
    @RequestMapping(value = "/")
    public String sayHello(){
        return helloService.sayHello();
    }

}
