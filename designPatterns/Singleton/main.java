package com.vicko.java.Singleton;

public class main {
    public static void main(String args[]){


        //No importa cuantas instancias se haga de la clase, siempre van a ser la misma instancia haciendo referencia hacia el mismo objeto
        logger log = logger.getInstance();
        logger log2 = logger.getInstance();

        log.printMessage("Hola como estas?");

        log.setName("Vicko");
        System.out.println(log2.getName());
    }
}
