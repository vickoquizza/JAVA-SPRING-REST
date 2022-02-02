package Topic1.Ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Client {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ponga sus opciones de manera especifica separadas por espacios, ejemplo: [c1 b1 m1]");
        String input = scan.nextLine().toLowerCase().replaceAll("\\s", "");
        String colorOption = input.substring(0,2);
        String batteryOption = input.substring(2,4);
        String memoryOption = input.substring(4);

        if ((input.length() < 6) || (input.length() > 6)){
            System.out.println("Debe digitar de nuevo los comandos, comando invalido");
        }else{
            Reproductor reproductor = new Reproductor(colorOption, batteryOption, memoryOption);

            reproductor.getSetup();
        }

    }
}
