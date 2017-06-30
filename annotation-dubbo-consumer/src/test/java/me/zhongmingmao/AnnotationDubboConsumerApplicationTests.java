package me.zhongmingmao;

import com.alibaba.dubbo.config.annotation.Reference;
import me.zhongmingmao.dubbo.api.HelloService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationDubboConsumerApplicationTests {
    
    @Reference(version = "1.0.0")
    private HelloService helloService;
    
    @Ignore("need dubbo-provider up")
    @Test
    public void helloServiceTest() {
        assertNotNull(helloService);
        assertFalse(StringUtils.isEmpty(helloService.sayHello()));
    }
    
}
