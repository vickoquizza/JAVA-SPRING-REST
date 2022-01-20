package com.vicko.java.abstractFactory;

public class ToyotaCarFactory implements CarFactory{
    @Override
    public Car createCar(String typeCar) {
        switch (typeCar){
            case "Camry":
                return new Camry();
            case "Corolla":
                return new Corolla();
            default:
                System.out.println("No car valid!");
                return null;

        }

    }
}
