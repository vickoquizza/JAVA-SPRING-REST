package com.vicko.Payroll.Exceptions;

public class OrderNotFoundException extends RuntimeException{
    public OrderNotFoundException(Long id){
        super("Order number " + id + " not found");
    }
}
