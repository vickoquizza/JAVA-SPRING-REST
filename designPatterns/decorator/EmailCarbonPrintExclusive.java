package com.vicko.java.decorator;

public class EmailCarbonPrintExclusive extends EmailDecorator{

    public EmailCarbonPrintExclusive(Email e){
        super(e);
    }

    @Override
    public void send() {
        getEmail().send();
        System.out.println("Sending this email whith Carbon Print Exclusive (BCC)");
    }

    @Override
    public void receive() {
        getEmail().receive();
        System.out.println("Receiving this email whith Carbon Print Exclusive (BCC)");
    }
}
