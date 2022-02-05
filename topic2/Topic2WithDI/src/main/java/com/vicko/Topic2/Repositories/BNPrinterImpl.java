package com.vicko.Topic2.Repositories;

import org.springframework.stereotype.Repository;


public class BNPrinterImpl implements Printer{
    @Override
    public String print() {
        return "Imprimiendo en la impresora que solo tiene blanco y negro.";
    }
}
