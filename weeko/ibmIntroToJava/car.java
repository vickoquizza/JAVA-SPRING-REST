package com.vicko.learn.java;

/* a defined class for a car, based on the class made for represent a person on the lecture */

public class car {
	private String make;
	private String model;
	private int year;
	private String typeOfCar;
	private String color;
	private int seats;
	
	//This is a constructor
	/*
	public car(String make, String model, int year, String typeOfCar, String color, int seats) {
		super();
		
		this.make = make;
		this.model = model;
		this.year = year;
		this.typeOfCar = typeOfCar;
		this.color = color;
		this.seats = seats;
		
		System.out.println("Car created!");
	}
	*/
	public void setMake(String newMake) {
		make = newMake;
	}
	
	public String getMake() {
		return make;
	}
}
