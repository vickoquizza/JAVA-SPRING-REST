package com.Vicko.Topic2WithPlainSpring.Repositories;

import org.springframework.stereotype.Repository;

@Repository
public class BNCPrinterImpl implements Printer {
    @Override
    public String print() {
        return "Imprimiendo en una impresora con Blanco,Negro y Color";
    }
}
