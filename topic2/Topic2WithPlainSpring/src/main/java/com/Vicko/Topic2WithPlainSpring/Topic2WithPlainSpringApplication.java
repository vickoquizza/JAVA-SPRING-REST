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
		Scanner scan = new Scanner(System.in);
		String input;

		//Inicializacion de los dos posibles impresoras disponibles en la oficiona y la oficina como tal
		WorkSpace workSpace = (WorkSpace) context.getBean("workSpace");

		System.out.println("Esta aplicación sirve para que elija la impresora donde quiere imprimir sus documentos");
		System.out.println("Envie BN, si quiere lo quiere hacer en la impresora que maneja solo Blanco y negro.");
		System.out.println("Envie BNC, si quiere lo quiere hacer en la impresora que maneja solo Blanco,Negro y Color.");
		System.out.print("Introduzca su opcion: ");
		input = scan.nextLine().toLowerCase();

		workSpace.dependencySetter(input);

		System.out.println(workSpace.printing());


	}

}
