package com.vicko.java.Prototype;

public class Sheep implements Animal{

    public Sheep(){
        System.out.println("BEEEEEEEE");
    }
    @Override
    public Animal makeCopy() throws CloneNotSupportedException {
        System.out.println("We're cloning a sheep");


        Sheep sheepClone = null;

        sheepClone = (Sheep) super.clone();

        return sheepClone;
    }

    public String talk(){
        return "BEEEEEEE *we can understand you*";
    }
}
