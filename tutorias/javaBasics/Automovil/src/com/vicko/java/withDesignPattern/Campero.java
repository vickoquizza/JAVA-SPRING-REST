package com.vicko.java.withDesignPattern;

public class Campero extends AutomovilDecorator{

    public Campero(Automovil auto){
        super(auto);
    }

    @Override
    public void pitar() {
        getAuto().pitar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando un campero");
    }

    @Override
    public void frenar() {
        System.out.println("Frenando un campero");
    }

    public void meterDobleTraccion() {
        System.out.println("Poniendo la doble tracción");
    }

    public void removerTecho(){
        System.out.println("Removiendo techo!");
    }

    public void ponerTecho(){
        System.out.println("Poniendo techo!");
    }
}
