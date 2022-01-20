package com.vicko.java.builder;

public class Car {
    private String carType;
    private String engine;
    private int seats;
    private String transmission;

    public Car(String carType, String engine, int seats, String transmission){
        this.carType = carType;
        this.engine = engine;
        this.seats = seats;
        this.transmission = transmission;
    }

    public String toString(){
        String carString = "";
        carString = "Fuel boosted Type of car: " +  this.carType + "has a " + this.engine + " engine and " + this.seats + " seats whith a " + this.transmission + " Transmission";
        return carString;
    }
}
