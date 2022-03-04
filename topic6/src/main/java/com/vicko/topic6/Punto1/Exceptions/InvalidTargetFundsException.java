package com.vicko.topic6.Punto1.Exceptions;

public class InvalidTargetFundsException extends RuntimeException{
    public InvalidTargetFundsException() {
        super("The target account would have less than triple of the value of the transaction");
    }
}
