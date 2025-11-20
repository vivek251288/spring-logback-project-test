package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLogbackTestApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringLogbackTestApplication.class, args);
		System.out.println("print inside log file error");
	}

}
