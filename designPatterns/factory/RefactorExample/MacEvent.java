package com.vicko.java.factory.RefactorExample;

public class MacEvent extends Creator{
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
