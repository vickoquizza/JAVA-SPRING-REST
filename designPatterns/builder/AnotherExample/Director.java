package com.vicko.java.builder.AnotherExample;

public class Director {

    public void createClassicPizzaWithExtra(PizzaBuilder builder){
        builder.setDough(DoughType.WITH_GLUTEN);
        builder.setCheese(CheeseType.MOZZARELLA);
        builder.hasExtra("Yes");
        builder.setToppings(Ingredients.SALAMI);
    }

    public void createClassicPizzaWithoutExtra(PizzaBuilder builder){
        builder.setDough(DoughType.WITH_GLUTEN);
        builder.setCheese(CheeseType.MOZZARELLA);
        builder.hasExtra("No");
        builder.setToppings(Ingredients.SALAMI);
    }

    public void createLightGluttenWithExtra(PizzaBuilder builder){
        builder.setDough(DoughType.WITHOUT_GLUTEN);
        builder.setCheese(CheeseType.GOAT);
        builder.hasExtra("No");
        builder.setToppings(Ingredients.SALAMI);
    }
}
