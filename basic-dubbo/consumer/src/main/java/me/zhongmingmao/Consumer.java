package me.zhongmingmao;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Future;

public class Consumer {
    
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        DemoService demoService = (DemoService) context.getBean("demoService");
        
        String hello = demoService.sayHello("world"); // execute remote invocation
        System.out.println(hello); // null
        
        Future<String> future = RpcContext.getContext().getFuture();
        System.out.println(future.get()); // Hello world
        
        System.in.read();
        context.stop();
    }
}