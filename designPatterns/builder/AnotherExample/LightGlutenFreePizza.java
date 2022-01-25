package com.vicko.java.builder.AnotherExample;

public class LightGlutenFreePizza {
    private final DoughType dough;
    private final CheeseType cheese;
    private final Ingredients toppings;
    private final boolean Extra;
    private int toppingsCant = 0;

    public LightGlutenFreePizza(DoughType dough, CheeseType cheese, Ingredients toppings, boolean extra){
        this.dough = dough;
        this.cheese = cheese;
        this.toppings = toppings;
        this.Extra = extra;
    }

    public void setToppingsCant(int numOfToppings){
        this.toppingsCant = numOfToppings;
    }

    public void giveOrder(){
        System.out.println("Your pizza has " + dough + " dough, with some " + cheese + " cheese and " + toppingsCant + toppings);
    }
}
