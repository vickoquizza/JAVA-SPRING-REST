package com.vicko.java.abstractFactory;

public class ChevroletCarFactory implements CarFactory{

    @Override
    public Car createCar(String typeCar) {
        switch (typeCar){
            case "Aveo":
                return new Aveo();
            case "Sail":
                return new Sail();
            default:
                System.out.println("No car valid!");
                return null;

        }
    }
}
