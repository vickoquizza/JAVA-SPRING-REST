package com.Vicko.Topic2WithPlainSpring.Repositories;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class BNCPrinterImpl implements Printer {
    @Override
    public String print() {
        return "Imprimiendo en una impresora con Blanco,Negro y Color";
    }
}
