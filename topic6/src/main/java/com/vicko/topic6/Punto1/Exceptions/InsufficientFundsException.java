package com.vicko.topic6.Punto1.Exceptions;

public class InsufficientFundsException extends RuntimeException{

    public InsufficientFundsException(){
        super("Insufficient funds in the origin account to do a transaction");
    }
}
