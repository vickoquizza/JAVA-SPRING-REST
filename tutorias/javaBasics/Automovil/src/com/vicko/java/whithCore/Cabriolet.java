package com.vicko.java.whithCore;

public class Cabriolet extends AutomovilEstandar{

    public Cabriolet(){
        super();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando un Cabriolet");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando un Cabriolet");
    }

    public void removerTecho(){
        System.out.println("Removiendo techo!");
    }

    public void ponerTecho(){
        System.out.println("Poniendo techo!");
    }
}
