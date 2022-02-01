package Topic1.Ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Carrito {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        HotDog perroConPiñayTocineta =  new CoreHotDog();

        System.out.println("Entre el ingrediente que le quiera poner a su perro caliente, si ya termino digite -1: ");
        String input = scan.nextLine().toLowerCase();

        while(!input.equals("-1")){
            if(input.equals("beacon")){
                perroConPiñayTocineta = new Beacon(perroConPiñayTocineta);
            }else if(input.equals("chips")){
                perroConPiñayTocineta = new Chips(perroConPiñayTocineta);
            }else if(input.equals("pineapple")){
                perroConPiñayTocineta = new Pinaple(perroConPiñayTocineta);
            }else if(input.equals("sauces")){
                perroConPiñayTocineta = new Sauces(perroConPiñayTocineta);
            }else{
                System.out.println("Introduzca un ingrediente valido!");
            }

            System.out.println("Entre el ingrediente que le quiera poner a su perro caliente, si ya termino digite -1: ");
            input = scan.nextLine().toLowerCase();
        }

        System.out.println("Su perro tiene " + perroConPiñayTocineta.addToDescription());



    }
}
