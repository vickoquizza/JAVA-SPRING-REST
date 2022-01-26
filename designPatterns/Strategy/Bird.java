package com.vicko.java.Strategy;

public class Bird extends Animal{
    public Bird(){
        super();

        System.out.println("Tweet Tweet");

        flyingType = new ItFlys();
    }
}
