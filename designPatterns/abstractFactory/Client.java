package com.vicko.java.abstractFactory;

public class Client {
    public static void main(String args[]){

        //Primero accedemos y creamos las platafromas para acceder a los productos
        CarFactory ToyotaFactory = FactoryProducer.getFactory("Toyota");
        CarFactory ChevroletFactory = FactoryProducer.getFactory("Chevrolet");

        //Ahora para acceder a los productos, lo hacemos desde las plataformas

        Car Corolla = ToyotaFactory.createCar("Corolla");
        Corolla.drive();
    }
}
