package com.vicko.Topic2.Controller;

import com.vicko.Topic2.Repositories.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PrinterController {

    private final Printer printer;

    public PrinterController(Printer printer) {
        this.printer = printer;
    }

    public String print(){
        return printer.print();
    }

}
