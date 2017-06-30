package me.zhongmingmao.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {
    
    @Value("${dubbo.application.name}")
    private String dubbo_application_name;
    
    @Value("${dubbo.registry.protocol}")
    private String dubbo_registry_protocol;
    
    @Value("${dubbo.registry.address}")
    private String dubbo_registry_address;
    
    
    /**
     * <dubbo:application/>
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(dubbo_application_name);
        return applicationConfig;
    }
    
    /**
     * <dubbo:registry/>
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol(dubbo_registry_protocol);
        registryConfig.setAddress(dubbo_registry_address);
        return registryConfig;
    }
    
    /**
     * <dubbo:annotation/>
     */
    @Bean
    public static AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage("me.zhongmingmao");
        return annotationBean;
    }
}
