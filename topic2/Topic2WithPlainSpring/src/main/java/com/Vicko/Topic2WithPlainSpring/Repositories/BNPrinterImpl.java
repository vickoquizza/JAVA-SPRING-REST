package com.Vicko.Topic2WithPlainSpring.Repositories;

import org.springframework.stereotype.Repository;

@Repository
public class BNPrinterImpl implements Printer {
    @Override
    public String print() {
        return "Imprimiendo en una impresora que solo funciona con Blanco y Negro";
    }
}
