package com.vicko.SprinDITest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprinDiTestApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SprinDiTestApplication.class, args);

		PetController petController = (PetController) context.getBean("petController");

		System.out.println(petController.whichAreTheBestPet());
	}

}
