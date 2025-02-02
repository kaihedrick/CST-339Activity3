package com.gcu.topic22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.gcu" })
@SpringBootApplication
public class Topic32Application {

	public static void main(String[] args) {
		SpringApplication.run(Topic32Application.class, args);
	}

}
