package com.vicko.java.decorator;

public class EmailCarbonPrint extends EmailDecorator{

    public EmailCarbonPrint(Email e){
        super(e);
    }

    @Override
    public void send() {
        getEmail().send();
        System.out.println("Sending this email whith Carbon Print (CC)");
    }

    @Override
    public void receive() {
        getEmail().receive();
        System.out.println("Receiving this email whith Carbon Print (CC)");
    }

}
