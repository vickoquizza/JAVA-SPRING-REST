package com.vicko.java.whithCore;

public class Campero extends AutomovilEstandar{

    public Campero(){
        super();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando un Campero");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando un Campero");
    }

    public void meterDobleTraccion() {
        System.out.println("Poniendo la doble tracción");
    }
}
