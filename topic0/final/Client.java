import java.util.Scanner;

public class Client {
    public static void main(String args[]){
        memoria Mem = new memoria();

        Mem.initializationMemory();

        int memoryPosicion = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Seleccione un comando o -1 para terminar el proceso: ");
        String input = scan.nextLine();

        while(!(input.equals("-1"))) {
            try{
                if (input.charAt(0) == 'c') {
                    if (input.charAt(1) == 's') {
                        memoryPosicion = Mem.crearSystemProccess(memoryPosicion);
                        Mem.showMemory();
                    } else if (input.charAt(1) == 'a') {
                        memoryPosicion = Mem.crearAplicationProccess(memoryPosicion);
                        Mem.showMemory();
                    }
                } else if (input.charAt(0) == 'd') {
                    memoryPosicion = Mem.deleteProccess(Character.getNumericValue(input.charAt(1)));
                    Mem.showMemory();
                } else {
                    System.out.println("Invalid input!");
                }
            }catch (Exception e){
                System.out.println("There is an Exception: " + e);
            }finally {
                System.out.print("Seleccione un comando o -1 para terminar el proceso: ");
                input = scan.nextLine();
            }

        }

    }
}
