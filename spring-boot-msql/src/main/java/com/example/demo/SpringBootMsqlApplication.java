package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMsqlApplication {
	
	@Autowired
	private JdbcTemplate template;
	
	@RequestMapping("/stock")
	public List < Map<String,Object> > stocks(){
		return template.queryForList("select * from stock");
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootMsqlApplication.class, args);
	}
}
