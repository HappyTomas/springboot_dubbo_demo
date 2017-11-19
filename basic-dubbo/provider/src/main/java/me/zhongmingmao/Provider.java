package me.zhongmingmao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/dubbo-demo-provider.xml"});
        context.start();
        // Main.main(args); 也可以这样启动
        System.in.read(); // press any key to exit
    }
}