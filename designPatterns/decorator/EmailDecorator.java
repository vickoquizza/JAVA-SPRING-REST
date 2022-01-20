package com.vicko.java.decorator;

public abstract class EmailDecorator implements Email{

    private Email message;

    public EmailDecorator(Email e){
        this.message = e;
    }

    protected Email getEmail(){
        return message;
    }
}
