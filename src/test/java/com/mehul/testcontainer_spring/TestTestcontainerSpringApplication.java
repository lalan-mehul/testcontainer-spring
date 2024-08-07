package com.mehul.testcontainer_spring;

import org.springframework.boot.SpringApplication;

public class TestTestcontainerSpringApplication {

	public static void main(String[] args) {
		SpringApplication.from(TestcontainerSpringApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
