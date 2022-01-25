package com.vicko.java.decorator.AnotherExample;

public class Order {
    public static void main(String args[]){
        Pizza firstPizza = new Sauce(new Mozzarella(new CorePizza()));

        System.out.println(firstPizza.getDescription());
        System.out.println(firstPizza.getCost());
    }
}
