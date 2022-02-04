package com.vicko.SpringBootJokesApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.vicko.SpringBootJokesApp"})
public class SpringBootJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJokesAppApplication.class, args);
	}

}
