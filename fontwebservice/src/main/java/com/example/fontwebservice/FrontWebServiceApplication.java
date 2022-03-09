package com.example.fontwebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class FrontWebServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(FrontWebServiceApplication.class, args);
	}
}
