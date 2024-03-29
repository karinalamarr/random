package com.lamarr.random;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class RandomApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomApplication.class, args);
	}

	
	@RequestMapping("/")
	public String hello() {
		return "Hello You! How are you doing?";
	}
	
	
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is awesome! So easy to respond with strings!!!";
	}
	
	
}
