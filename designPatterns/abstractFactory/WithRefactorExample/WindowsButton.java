package com.vicko.java.abstractFactory.WithRefactorExample;

public class WindowsButton implements Button{
    @Override
    public void makeButton() {
        System.out.println("Has hecho un boton para Windows!");
    }
}
