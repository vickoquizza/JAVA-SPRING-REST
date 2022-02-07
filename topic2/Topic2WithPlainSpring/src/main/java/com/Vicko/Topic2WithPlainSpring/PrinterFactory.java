package com.Vicko.Topic2WithPlainSpring;

import com.Vicko.Topic2WithPlainSpring.Repositories.BNCPrinterImpl;
import com.Vicko.Topic2WithPlainSpring.Repositories.BNPrinterImpl;
import com.Vicko.Topic2WithPlainSpring.Repositories.Printer;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class PrinterFactory {
    private Scanner scan = new Scanner(System.in);

    public Printer getPrinter(){
        String type = "";

        System.out.println("Esta aplicación sirve para que elija la impresora donde quiere imprimir sus documentos");
        System.out.println("Envie BN, si quiere lo quiere hacer en la impresora que maneja solo Blanco y negro.");
        System.out.println("Envie BNC, si quiere lo quiere hacer en la impresora que maneja solo Blanco,Negro y Color.");
        System.out.print("Introduzca su opcion: ");
        type = scan.nextLine().toLowerCase();

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
