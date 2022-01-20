package com.vicko.java.factory;

public class Fabrica {
    public static TransporteBase create(String type){
        switch (type){
            case "carro":
                return new carro();
            case "bicicleta":
                return new bicicleta();
            default:
                System.out.println("There is no type compatible with this choice");
                return null;
        }
    }
}
