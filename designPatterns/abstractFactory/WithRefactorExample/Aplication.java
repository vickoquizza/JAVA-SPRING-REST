package com.vicko.java.abstractFactory.WithRefactorExample;

// Este seria el acceso a las factories por que al final el cliente no tiene que enterarse de a que familia tiene que acceder

public class Aplication {
    private Button button;
    private CheckBox checkBox;

    public Aplication(GUIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void make(){
        button.makeButton();
        checkBox.makeCheckBox();
    }
}
