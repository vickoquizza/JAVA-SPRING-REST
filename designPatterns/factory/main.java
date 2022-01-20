package com.vicko.java.factory;

public class main {
    public static void main(String args[]){
        TransporteBase t1 = Fabrica.create("carro");

        t1.arrancar();
        t1.detener();
        System.out.println(t1.getType());
    }
}
