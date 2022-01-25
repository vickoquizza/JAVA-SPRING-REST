package com.vicko.java.Singleton.anotherExample;

public class ClientSingleton {
    public static void main(String args[]){

        Singleton firstSingleton = Singleton.getInstance("Hola, como estas?");
        Singleton segundaSingleton = Singleton.getInstance("Todo muy bien y tu?");
        System.out.println(firstSingleton.someValue);
        System.out.println(segundaSingleton.someValue);
    }
}
