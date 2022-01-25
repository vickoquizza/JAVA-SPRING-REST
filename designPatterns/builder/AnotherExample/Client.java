package com.vicko.java.builder.AnotherExample;

public class Client {

    public static void main(String args[]){
        Director dir = new Director();

        LightGlutenFreePizzaBuilder firtPizza = new LightGlutenFreePizzaBuilder();
        dir.createLightGluttenWithExtra(firtPizza);
        LightGlutenFreePizza withExtra = firtPizza.getPizza();

        withExtra.setToppingsCant(6);
        withExtra.giveOrder();

    }
}
