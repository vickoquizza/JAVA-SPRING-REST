package com.vicko.java.builder.AnotherExample;

public interface PizzaBuilder {
    public void setDough(DoughType dough);
    public void setCheese(CheeseType cheese);
    public void setToppings(Ingredients toppings);
    public void hasExtra(String withExtra);

}
