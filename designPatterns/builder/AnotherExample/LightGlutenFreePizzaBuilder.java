package com.vicko.java.builder.AnotherExample;

public class LightGlutenFreePizzaBuilder implements PizzaBuilder{
    private DoughType dough;
    private CheeseType cheese;
    private Ingredients toppings;
    private boolean Extra;


    @Override
    public void setDough(DoughType dough) {
        this.dough = dough;
    }

    @Override
    public void setCheese(CheeseType cheese) {
        this.cheese = cheese;
    }

    @Override
    public void setToppings(Ingredients toppings) {
        this.toppings = toppings;
    }

    @Override
    public void hasExtra(String withExtra) {
        if (withExtra.equals("Yes")){
            this.Extra = true;
        }else{
            this.Extra = false;
        }
    }

    public LightGlutenFreePizza getPizza(){
        return new LightGlutenFreePizza(dough,cheese,toppings,Extra);
    }
}
