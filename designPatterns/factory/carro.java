package com.vicko.java.factory;

public class carro implements TransporteBase{

    public carro() {

    }
    @Override
    public void arrancar() {
        System.out.println("Started Engine!");
    }

    @Override
    public void detener() {
        System.out.println("Stopped Engine!");
    }

    @Override
    public String getType() {
        return "Automovil";
    }
}
