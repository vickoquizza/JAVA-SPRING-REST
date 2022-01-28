package com.vicko.java.Prototype;

public class Cloning {

    public static void main(String args[]) throws CloneNotSupportedException {
        CloneFactory animalMaker = new CloneFactory();

        Sheep newSheep = new Sheep();

        Sheep cloneSheep = (Sheep) animalMaker.getClone(newSheep);

        System.out.println(newSheep);
        System.out.println(cloneSheep);

        System.out.println(newSheep.talk());
        System.out.println(cloneSheep.talk());
    }
}
