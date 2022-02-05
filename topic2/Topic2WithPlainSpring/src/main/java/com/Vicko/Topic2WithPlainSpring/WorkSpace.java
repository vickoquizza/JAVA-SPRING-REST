package com.Vicko.Topic2WithPlainSpring;

import org.springframework.beans.factory.annotation.Value;

public class WorkSpace {
    private Printer printer;

    public void dependencySetter(Printer printer){
        this.printer = printer;
    }

    public String printing(){
        return printer.print();
    }


}
