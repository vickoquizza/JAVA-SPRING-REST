package com.vicko.java.withDesignPattern;

public class Client {

    public static void main(String args[]){
        Automovil auto = new AutomovilEstandar();

        auto.acelerar();

        auto = new Cabriolet(auto);

        auto.acelerar();
    }


}
