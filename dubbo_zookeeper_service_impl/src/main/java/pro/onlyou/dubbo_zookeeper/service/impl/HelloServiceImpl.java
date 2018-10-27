package pro.onlyou.dubbo_zookeeper.service.impl;

import pro.onlyou.dubbo_zookeeper.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "啊哈！";
    }
}
