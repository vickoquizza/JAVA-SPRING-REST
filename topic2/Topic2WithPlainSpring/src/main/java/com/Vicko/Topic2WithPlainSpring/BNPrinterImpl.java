package com.Vicko.Topic2WithPlainSpring;

public class BNPrinterImpl implements Printer{
    @Override
    public String print() {
        return "Imprimiendo en una impresora que solo funciona con Blanco y Negro";
    }
}
