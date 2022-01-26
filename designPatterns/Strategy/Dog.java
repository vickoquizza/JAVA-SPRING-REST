package com.vicko.java.Strategy;

public class Dog extends Animal{
    public Dog(){
        super();

        System.out.println("Bark");

        flyingType = new CantFly();
    }
}
