package com.vicko.java.builder;

public class CarClient {

    public static void main(String args[]){
        Director carDirector = new Director();

        CarConcreteBuilder sportsFuelCarBuilder = new CarConcreteBuilder();

        carDirector.constructSportsCar(sportsFuelCarBuilder);
        Car sportsFuelCar = sportsFuelCarBuilder.getResult();
        System.out.println("Car built: " + sportsFuelCar.toString());

        ElectricCarConcreteBuilder sportsElectricCarBuilder = new ElectricCarConcreteBuilder();

        carDirector.constructCoupeCar(sportsElectricCarBuilder);
        ElectricCar sportsElectricCar = sportsElectricCarBuilder.getResult();
        System.out.println("Car built: " + sportsElectricCar.toString());
    }
}
