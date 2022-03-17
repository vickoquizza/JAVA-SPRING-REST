package com.vicko.topic7.Exceptions;

public class MDNotFoundException extends RuntimeException{
    public MDNotFoundException(){
        super("Meteorological data record not found");
    }
}
