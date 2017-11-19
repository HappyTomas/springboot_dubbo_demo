package me.zhongmingmao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-demo-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world"); // execute remote invocation
        System.out.println(hello); // show the result
        System.in.read(); // press any key to exit
        context.stop();
    }
}