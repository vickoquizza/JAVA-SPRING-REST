package com.vicko.java.withDesignPattern;

public class AutomovilEstandar implements Automovil{

    @Override
    public void pitar() {
        System.out.println("3.1416 3.1416 3.1416");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando un Automovil Estandar");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando un Automovil Estandar");
    }
}
