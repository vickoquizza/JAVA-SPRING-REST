package com.vicko.java.withDesignPattern;

public class Cabriolet extends AutomovilDecorator {

    public Cabriolet(Automovil auto){
        super(auto);
    }

    @Override
    public void pitar() {
        getAuto().pitar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando un Cabriolet");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando un Cabriolet");
    }
}
