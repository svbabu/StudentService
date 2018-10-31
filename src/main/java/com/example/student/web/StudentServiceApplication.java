package com.example.student.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

 // this annotation intialize the spring boot auto configuration and 
//spring Appliction context

@SpringBootApplication
@ComponentScan("com.example.student.web")
public class StudentServiceApplication {

	public static void main(String[] args) {
		//run is static method  which is used to lunch the Spring Boot appln
		SpringApplication.run(StudentServiceApplication.class, args);
	}
}
