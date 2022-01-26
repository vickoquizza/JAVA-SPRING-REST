package com.vicko.java.Strategy;

public class Client {
    public static void main(String args[]){
        Animal doggie =  new Dog();
        System.out.println(doggie.tryToFly());
        Animal birdie = new Bird();
        System.out.println(birdie.tryToFly());



    }
}
