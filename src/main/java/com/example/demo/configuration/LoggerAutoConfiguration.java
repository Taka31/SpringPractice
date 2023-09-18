package com.example.demo.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.LogProperties;
import com.example.demo.service.LogService;
import com.example.demo.service.LogServiceImpl;

@Configuration
@ConditionalOnClass(LogService.class)
@EnableConfigurationProperties(LogProperties.class)
public class LoggerAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public LogService logService(){
        return new LogServiceImpl();
    }
    
}
