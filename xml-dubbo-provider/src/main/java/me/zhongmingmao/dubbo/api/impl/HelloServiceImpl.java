package me.zhongmingmao.dubbo.api.impl;

import me.zhongmingmao.dubbo.api.HelloService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Service // Spring @Service
public class HelloServiceImpl implements HelloService {
    
    @Override
    public String sayHello() {
        return String.format("Hello World! , Current Time : [%s]",
                LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
