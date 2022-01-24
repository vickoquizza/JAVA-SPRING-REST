package com.vicko.java.factory.RefactorExample;

public abstract class Creator {
    public abstract Button createButton();

    public void clickButton(){
        Button clickedButton = createButton();
        System.out.println("An event is ocurring!");
        clickedButton.onClickEvent();
    }
}
