package me.zhongmingmao;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service("demoService")
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return "Hello " + name;
    }
}