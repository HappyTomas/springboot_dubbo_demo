package me.zhongmingmao.dubbo.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import me.zhongmingmao.dubbo.api.HelloService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Service(version = "1.0.0") // Dubbo @Service
public class HelloServiceImpl implements HelloService {
    
    @Override
    public String sayHello() {
        return String.format("Hello World! , Current Time : [%s]",
                LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
