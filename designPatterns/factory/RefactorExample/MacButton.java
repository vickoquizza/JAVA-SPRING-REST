package com.vicko.java.factory.RefactorExample;

public class MacButton implements Button{
    @Override
    public void onClickEvent() {
        System.out.println("*Click*!");
    }

    @Override
    public void onMantainEvent() {
        System.out.println("FFFFFFFFF!");

    }

    @Override
    public void onReleaseEvent() {
        System.out.println("PIMP!");
    }
}
