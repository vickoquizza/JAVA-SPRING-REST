package com.vicko.java.builder.AnotherExample;

public class ClassicPizza {
    private final DoughType dough;
    private final CheeseType cheese;
    private final Ingredients toppings;
    private final boolean Extra;


    public ClassicPizza(DoughType dough, CheeseType cheese, Ingredients toppings, boolean extra){
        this.dough = dough;
        this.cheese = cheese;
        this.toppings = toppings;
        this.Extra = extra;
    }


    public void giveOrder(){
        System.out.println("Your pizza has " + dough + " dough, with some " + cheese + " cheese and " + toppings + "With an extra");
    }
}
