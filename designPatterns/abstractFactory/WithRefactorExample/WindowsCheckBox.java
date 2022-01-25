package com.vicko.java.abstractFactory.WithRefactorExample;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void makeCheckBox() {
        System.out.println("Has creado un check box de Windows!");
    }
}
