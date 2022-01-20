package com.vicko.java.builder;

public class CarConcreteBuilder implements CarBuilder{
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

    public void sound(){
        System.out.println("BRRRRR BRRRRRR");
    }

    public Car getResult(){
        return new Car(carType, engine, seats, transmission);
    }
}
