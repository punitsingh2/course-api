package com.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.java.springboot")
public class CourseAPIApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CourseAPIApp.class, args);

	}

}
