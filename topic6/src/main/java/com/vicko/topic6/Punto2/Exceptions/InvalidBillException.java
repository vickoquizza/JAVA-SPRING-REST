package com.vicko.topic6.Punto2.Exceptions;

public class InvalidBillException extends RuntimeException{
    public InvalidBillException(){
        super("The bill id must start with '00' and have 7 digits");
    }
}
