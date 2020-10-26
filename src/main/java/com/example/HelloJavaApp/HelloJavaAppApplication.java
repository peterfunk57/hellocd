package com.example.hellocd;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class HelloJavaAppApplication {


	@RequestMapping("/")
	String home() {
		return "Hola Mundo, Saludos!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloJavaAppApplication.class, args);
	}

}