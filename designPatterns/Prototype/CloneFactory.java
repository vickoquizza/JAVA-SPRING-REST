package com.vicko.java.Prototype;

public class CloneFactory {

    public Animal getClone(Animal sample) throws CloneNotSupportedException {

        return sample.makeCopy();

    }
}
