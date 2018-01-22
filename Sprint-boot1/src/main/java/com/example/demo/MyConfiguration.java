package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class MyConfiguration {
	 @Bean
	 public String message() {
		 return "hello cabrel";
	 }

}
