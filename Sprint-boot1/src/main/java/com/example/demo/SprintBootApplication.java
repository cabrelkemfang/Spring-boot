package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SprintBootApplication {
	
	@Value("${name}")
	String name;
	
	@Autowired 
	String message ;
	
	@RequestMapping("/")
	public String home() {
		return message;
	}
	
	@RequestMapping("/name")
	public String homeName() {
		return name;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SprintBootApplication.class, args);
	}
}
