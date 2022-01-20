package com.vicko.java.whithCore;

public class Bus extends AutomovilEstandar{

    public Bus(){
        super();
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
