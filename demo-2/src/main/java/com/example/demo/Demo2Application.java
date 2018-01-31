package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
public class Demo2Application {
	
	@Value("${name}")
	String name;
	
	@Autowired
	String message1;
	
	 @RequestMapping("/user")
	public String welcome() {
		return message1 ;
	}

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}
}
