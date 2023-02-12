package com.springtest.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringtestApplication {

	@GetMapping("/message")
	public String getmessage(){
		return "This is first spring boot applicaiton.";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringtestApplication.class, args);
	}

}
