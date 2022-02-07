package com.Vicko.Topic2WithPlainSpring;

import org.springframework.beans.factory.annotation.Value;

public class WorkSpace {
    private Printer printer;

    private PrinterFactory printerFactory = new PrinterFactory();

    public void dependencySetter(String type){
        this.printer = printerFactory.getPrinter(type);
    }

    public String printing(){
        return printer.print();
    }


}
