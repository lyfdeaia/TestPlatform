package com.liyongfeng.TestPlatform;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class TestPlatformApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TestPlatformApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(TestPlatformApplication.class, args);
		int length = context.getBeanDefinitionNames().length;
		log.info("Spring boot启动初始化了{}个Bean", length);
		log.error("Spring boot启动初始化了{}个Bean", length);

	}

}
