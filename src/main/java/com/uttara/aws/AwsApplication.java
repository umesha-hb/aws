package com.uttara.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsApplication {

	public static void main(String[] args) {

		SpringApplication.run(AwsApplication.class, args);
	}
	@GetMapping("/")
	public String home()
	{
		return "Welcome to AWS First deployment";
	}

}
