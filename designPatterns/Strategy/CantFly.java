package com.vicko.java.Strategy;

public class CantFly implements Flys {

    @Override
    public String fly() {
        return "It can´t fly";
    }
}
