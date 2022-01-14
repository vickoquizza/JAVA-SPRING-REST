package com.vicko.intro;

import java.util.Locale;
import java.util.logging.Logger;

public class Person {
	
	//Logger sirve para tener constancia de como esta funcionando la clase internamente
	
	private static final Logger logger = Logger.getLogger(Person.class.getName());
	//private String name;
	private String firstName;
	private String lastName;
	private int age;
	private int weight;
	private double height;
	private boolean isAdult;
	
	public Person(String firstName, String lastName, int age, int weight, double height, boolean isAdult) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.isAdult = isAdult;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getHeight() {
		if(Locale.getDefault().equals(Locale.US)) {
			height /= 2.54;
		}
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isAdult() {
		return isAdult;
	}
	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		
		// eso se llama encadenar llamadas de metodo
		return getFirstName().concat(" ").concat(getLastName());
	}

}
