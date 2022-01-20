package com.vicko.java.withDesignPattern;

public class Bus extends AutomovilDecorator{

    public Bus(Automovil auto){
        super(auto);
    }

    @Override
    public void pitar() {
        getAuto().pitar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando un bus");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando un bus");
    }
}
