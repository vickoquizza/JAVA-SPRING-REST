package com.vicko.java.decorator;

public class ClientEmail {
    public static void main(String args[]){
        Email mensaje = new EmailCore("Hola, soy nuevo", "Lo que dice soy nuevo", "nuevo.txt");
        mensaje = new EmailCarbonPrint(mensaje);
        mensaje.send();
        mensaje.receive();
    }


}
