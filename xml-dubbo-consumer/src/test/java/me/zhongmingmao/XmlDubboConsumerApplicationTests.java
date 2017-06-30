package me.zhongmingmao;

import me.zhongmingmao.dubbo.api.HelloService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XmlDubboConsumerApplicationTests {
    
    @Autowired
    private HelloService helloService;
    
    @Ignore("need xml-dubbo-provider up")
    @Test
    public void helloServiceTest() {
        assertNotNull(helloService);
        assertFalse(StringUtils.isEmpty(helloService.sayHello()));
    }
    
}
