package com.mehul.testcontainer_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.mehul")
public class TestcontainerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestcontainerSpringApplication.class, args);
	}

}
