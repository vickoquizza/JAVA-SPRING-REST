package com.vicko.java.factory.RefactorExample;

public class WindowsEvent extends Creator{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
