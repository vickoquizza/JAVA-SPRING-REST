package com.vicko.emailingServiceDemo.Exceptions;

public class BodyNeededException extends RuntimeException{
    public BodyNeededException(){
        super("Body needed to send an email");
    }
}
