package com.vicko.java.abstractFactory.WithRefactorExample;

public class MacCheckBox implements CheckBox{
    @Override
    public void makeCheckBox() {
        System.out.println("Has creado un boton para Mac!");
    }
}
