package com.vicko.Topic2;

import com.vicko.Topic2.Controller.PrinterController;
import com.vicko.Topic2.Repositories.Printer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class Topic2Application {

	public static void main(String[] args) {
		ApplicationContext context  = SpringApplication.run(Topic2Application.class, args);

		PrinterController controller = (PrinterController) context.getBean("printerController");

		System.out.println(controller.print());
	}

}
