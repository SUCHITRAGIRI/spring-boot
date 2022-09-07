package com.example.restfulservices.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		System.out.println("Present Project Directory : "+ System.getProperty("user.dir"));
		SpringApplication.run(RestServiceApplication.class, args);
	}

}
