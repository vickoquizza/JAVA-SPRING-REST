package com.Vicko.Topic2WithPlainSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Topic2WithPlainSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Topic2WithPlainSpringApplication.class,args);

		//Inicializacion del controlador en el contexto de la aplicación
		WorkSpace workSpace = (WorkSpace) context.getBean("workSpace");

		System.out.println(workSpace.getPrinter());


	}

}
