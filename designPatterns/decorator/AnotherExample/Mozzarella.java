package com.vicko.java.decorator.AnotherExample;

public class Mozzarella extends ToppingDecorator{
    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding dought");

        System.out.println("Adding mozzarela");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Mozzarella";
    }

    public double getCost(){
        return tempPizza.getCost() + 0.5;
    }
}
