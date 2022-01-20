package com.vicko.java.builder;

public class ElectricCarConcreteBuilder implements CarBuilder{
    private String carType;
    private String engine;
    private int seats;
    private String transmission;

    @Override
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void electricSound(){
        System.out.println("No sound!");
    }

    public ElectricCar getResult(){
        return new ElectricCar(carType, engine, seats, transmission);
    }
}
