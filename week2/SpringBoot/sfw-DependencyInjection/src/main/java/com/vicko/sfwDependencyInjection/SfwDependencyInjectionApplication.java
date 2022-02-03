package com.vicko.sfwDependencyInjection;

import com.vicko.sfwDependencyInjection.Controler.I18nController;
import com.vicko.sfwDependencyInjection.Controler.MyController;
import com.vicko.sfwDependencyInjection.Controler.WithSpring.ContructorInjectionControllerSpring;
import com.vicko.sfwDependencyInjection.Controler.WithSpring.PropertyInjectionControllerSpring;
import com.vicko.sfwDependencyInjection.Controler.WithSpring.SetterInjectionControllerSpring;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfwDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfwDependencyInjectionApplication.class, args);

		//Esto se hace para preguntar al contexto de Spring en la aplicación y recibir determinados controladores o cosas que necesita Spring para actuar
		//Usar esto es similar a usar myController controller = new myController pero para traerlo al contexto de Spring
		MyController controller = (MyController) context.getBean("myController");

		//Ahora usando primary Beans vamos a mejorar la manera en como se pueden injectar las dependencias del controlador

		//Como no hay configuración sobre un servidor, el programa en spring va tener un inicio y un fin
		//Como se tiene un servicio con Primary beans, spring va a referirse a este como su servicio por defecto
		System.out.println(controller.sayHello());

		//Ahora vamos a usar el Spring Context para hacer las diferentes inyecciones de dependencias

		System.out.println("Property ------------------");
		PropertyInjectionControllerSpring propertyInjectionControllerSpring = (PropertyInjectionControllerSpring) context.getBean("propertyInjectionControllerSpring");

		System.out.println(propertyInjectionControllerSpring.getGrettings());

		//Ahora vamos a hacer la inyeccion de dependencias con setters y usando spring

		System.out.println("Setter based---------------");

		SetterInjectionControllerSpring setterInjectionControllerSpring = (SetterInjectionControllerSpring) context.getBean("setterInjectionControllerSpring");

		System.out.println(setterInjectionControllerSpring.getGrettings());

		System.out.println("Contructor ----------------");

		ContructorInjectionControllerSpring contructorInjectionControllerSpring = (ContructorInjectionControllerSpring) context.getBean("contructorInjectionControllerSpring");

		System.out.println(contructorInjectionControllerSpring.getGrettings());

		//Los perfiles para la inyección de dependencias funcionan asi

		I18nController i18nController = (I18nController) context.getBean("i18nController");

		System.out.println(i18nController.sayHello());





	}

}
