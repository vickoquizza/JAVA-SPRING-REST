package com.vicko.java.decorator.AnotherExample;

public class Sauce extends ToppingDecorator{
    public Sauce(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding Sauce");
    }

    public String getDescription(){
        return tempPizza.getDescription() + ", Cheese";
    }

    public double getCost(){
        return tempPizza.getCost() + 1.0;
    }
}
