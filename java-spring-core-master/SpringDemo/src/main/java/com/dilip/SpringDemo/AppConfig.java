package com.dilip.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dilip.SpringDemo")
public class AppConfig {

// not required as we have added component-scan,
// it automatically scans for component in the given package
	
//	@Bean
//	public Human getHuman() {
//		return new Human();
//	}
}
