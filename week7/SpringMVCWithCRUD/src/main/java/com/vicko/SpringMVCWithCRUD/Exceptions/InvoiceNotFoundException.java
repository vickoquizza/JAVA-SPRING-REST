package com.vicko.SpringMVCWithCRUD.Exceptions;

public class InvoiceNotFoundException extends RuntimeException{

    public InvoiceNotFoundException(){
        super();
    }

    public InvoiceNotFoundException(String m){
        super(m);
    }
}
