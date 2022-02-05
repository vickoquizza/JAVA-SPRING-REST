package com.vicko.Topic2.Repositories;

public class PrinterFactory {

    public Printer getPrinter(String type){
        switch(type){
            case "BN":
                return new BNPrinterImpl();
            case "BNC":
                return new BNColorPrinterImpl();
            default:
                return new BNPrinterImpl();
        }
    }
}
