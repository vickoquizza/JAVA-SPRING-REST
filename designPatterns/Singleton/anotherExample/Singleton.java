package com.vicko.java.Singleton.anotherExample;

public class Singleton {
    private static Singleton instance;
    public String someValue;

    private Singleton(String Value){
        this.someValue = Value;
    }

    public static Singleton getInstance(String anotherValue){
        if(instance == null){
            instance = new Singleton(anotherValue);
        }
        return instance;
    }
}
