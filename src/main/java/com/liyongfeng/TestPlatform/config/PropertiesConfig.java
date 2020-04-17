package com.liyongfeng.TestPlatform.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:enviroment.properties")
public class PropertiesConfig {
    @Value("${domain.url}")
    @Getter
    @Setter
    private String domainUrl;
}
