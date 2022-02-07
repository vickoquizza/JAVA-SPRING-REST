package com.Vicko.Topic2WithPlainSpring;

public class PrinterFactory {
    public Printer getPrinter(String type){
        switch (type){
            case "bn":
                return new BNPrinterImpl();
            case "bnc":
                return new BNCPrinterImpl();
            default:
                return new BNPrinterImpl();
        }
    }
}
