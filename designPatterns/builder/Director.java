package com.vicko.java.builder;

public class Director {

    public void constructSportsCar(CarBuilder builder){
        builder.setCarType("Sports car");
        builder.setEngine("1000 CV");
        builder.setSeats(2);
        builder.setTransmission("Automatic");
    }

    public void constructSUVCar(CarBuilder builder){
        builder.setCarType("SUV car");
        builder.setEngine("350 CV");
        builder.setSeats(5);
        builder.setTransmission("Manual");
    }

    public void constructCoupeCar(CarBuilder builder){
        builder.setCarType("Coupe car");
        builder.setEngine("250 CV");
        builder.setSeats(5);
        builder.setTransmission("Semiautomatic");
    }
}
