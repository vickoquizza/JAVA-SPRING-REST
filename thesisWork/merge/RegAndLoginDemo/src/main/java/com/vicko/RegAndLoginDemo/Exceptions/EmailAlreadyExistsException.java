package com.vicko.RegAndLoginDemo.Exceptions;

public class EmailAlreadyExistsException extends RuntimeException{
    public EmailAlreadyExistsException(String email){
        super("ERROR: Try again, email " + email + " already exists.");
    }
}
