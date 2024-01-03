package com.example.springbootawsec2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAwsEc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsEc2Application.class, args);
	}
	
	@GetMapping("/")
	public String getData() {
		return "HELLO KIRUTHIKA SRINIVASAN FROM AMIZHTH TECHNOLOGY-- HELLO";
	}
}
