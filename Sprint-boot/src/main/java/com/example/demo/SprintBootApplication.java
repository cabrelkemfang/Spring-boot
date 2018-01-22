package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SprintBootApplication {
	
	@RequestMapping("/")
	public String home() {
		return "hello word";
	}

	public static void main(String[] args) {
		SpringApplication.run(SprintBootApplication.class, args);
	}
}
