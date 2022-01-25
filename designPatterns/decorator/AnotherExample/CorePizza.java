package com.vicko.java.decorator.AnotherExample;

public class CorePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Thin dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
