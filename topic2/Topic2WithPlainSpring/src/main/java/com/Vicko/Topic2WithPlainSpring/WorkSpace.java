package com.Vicko.Topic2WithPlainSpring;

import com.Vicko.Topic2WithPlainSpring.Repositories.Printer;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WorkSpace {
    private Printer printer;

    @Autowired
    private PrinterFactory printerFactory;

    public String getPrinter() {
        return printerFactory.getPrinter().print();
    }
}
