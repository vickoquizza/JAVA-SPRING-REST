package com.vicko.java.factory;

public class bicicleta implements TransporteBase{

    public bicicleta(){

    }
    @Override
    public void arrancar() {
        System.out.println("Started to move the pedals");
    }

    @Override
    public void detener() {
        System.out.println("Stopped to move the pedals");
    }

    @Override
    public String getType() {
        return "Bicicleta";
    }
}
