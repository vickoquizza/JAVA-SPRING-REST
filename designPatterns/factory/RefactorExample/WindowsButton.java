package com.vicko.java.factory.RefactorExample;

public class WindowsButton implements Button{

    @Override
    public void onClickEvent() {
        System.out.println("*Click*!");
    }

    @Override
    public void onMantainEvent() {
        System.out.println("HOlDING!");

    }

    @Override
    public void onReleaseEvent() {
        System.out.println("PUMP!");
    }
}
