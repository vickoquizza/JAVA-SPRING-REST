package com.vicko.topic8.Exceptions;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(){
        super("Book not found");
    }
}
