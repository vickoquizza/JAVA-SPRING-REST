package com.vicko.java.Prototype;

public interface Animal extends Cloneable{

    public Animal makeCopy() throws CloneNotSupportedException;

}
