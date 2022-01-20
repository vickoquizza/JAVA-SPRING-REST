package com.vicko.java.abstractFactory;

public class FactoryProducer {
    public static CarFactory getFactory(String typeFactory){
        switch (typeFactory){
            case "Toyota":
                return new ToyotaCarFactory();
            case "Chevrolet":
                return new ChevroletCarFactory();
            default:
                System.out.println("No factory valid!");
                return null;

        }
    }
}
