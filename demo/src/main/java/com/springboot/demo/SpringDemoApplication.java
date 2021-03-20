package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // tells Spring Boot that this is the starting point of the app
// this enables auto-configuration, component scanning and
// register/import additional configuration classes
public class SpringDemoApplication {

	public static void main(String[] args) {
		// creates servlet container, starts it & hosts the application
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
