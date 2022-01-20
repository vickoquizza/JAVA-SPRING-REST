package com.vicko.java.whithCore;

public class Main {
    public static void main(String args[]){
        AutomovilEstandar auto = new AutomovilEstandar();
        Bus buseta = new Bus();
        Cabriolet cabriola = new Cabriolet();
        Campero jeep = new Campero();

        auto.acelerar();
        buseta.frenar();
        cabriola.ponerTecho();
        jeep.meterDobleTraccion();

        auto.pitar();
        jeep.pitar();
    }
}
