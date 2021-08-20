package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ImportResource("applicationContext.xml")
@ComponentScan(basePackages= {"com.example.controller"})
public class WebAppDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebAppDemoApplication.class, args);
	}

}
