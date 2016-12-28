package com.ganga;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.ganga")
@ImportResource("classpath*:/spring/si-config.xml")
public class SpringIntegrationDemoApplication {

	
	public static void main(String[] args) {
		//ConfigurableApplicationContext context = SpringApplication.run(SpringIntegrationDemoApplication.class, args);
		SpringApplication.run(SpringIntegrationDemoApplication.class, args);
	}
}

