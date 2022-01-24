import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class memoria {
    private static String[] memory = new String[200];
    private static int id = 1;


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
                System.out.println("There is an Eception: " + e);
            }finally {
                System.out.print("Seleccione un comando o -1 para terminar el proceso: ");
                input = scan.nextLine();
            }

        }

    }


    public void initializationMemory(){
        for(int i = 0; i < 200; i++){
            memory[i] = "****";
        }
    }

    public int crearSystemProccess(int initialPosition) throws MemoryOverflowException{
        int finalPosition = ((int) Math.floor(Math.random()*(15-5+1)+5)) +  initialPosition;
        int positionTaken = initialPosition;
        if (finalPosition >= 200){
            throw new MemoryOverflowException("The memory is full");
        }else{
            for (int i = initialPosition; i <= finalPosition; i++ ){
                memory[i] = "s" + "00" + id;
                positionTaken++;
            }
            id++;
        }
        return positionTaken;
    }

    public int crearAplicationProccess(int initialPosition) throws MemoryOverflowException{
        int finalPosition = ((int) Math.floor(Math.random()*(15-5+1)+5)) +  initialPosition;
        int positionTaken = initialPosition;
        if (finalPosition >= 200){
            throw new MemoryOverflowException("The memory is full");
        }else{
            for (int i = initialPosition; i <= finalPosition; i++ ){
                memory[i] = "a" + "00" + id;
                positionTaken++;
            }
            id++;
        }
        return positionTaken;
    }

    public int deleteProccess(int idWanted){
        Set<String> processNameSet = new HashSet<>(Arrays.asList(memory));
        String[] processName = processNameSet.toArray(new String[id]);
        String aux = "****";
        int init = 0;

        while(idWanted < id) {


            for (int i = 0; i < processName.length; i++) {
                if (processName[i].charAt(3) == (Character.forDigit(idWanted + 1, 10))) {
                    aux = processName[i];
                }
            }

            init = scrapProcess(idWanted, init, aux);

            System.out.println("IdWantedIs : " + idWanted);


            idWanted++;
        }

        return init;

    }


    public int scrapProcess(int idWanted, int initialValue, String aux) {
        int firstValue = 0;
        int counter = 0;
        int counter2 = 0;
        int lastValue = 0;
        int diffBetweenProcesses = 0;

        if (idWanted == 1){
            firstValue = 0;

            for (int j = initialValue; j < 200; j++) {
                if (memory[j].charAt(3) == (Character.forDigit(idWanted, 10))) {
                    counter++;
                }
            }
        }else{
            for (int j = initialValue; j < 200; j++) {
                if (memory[j].charAt(3) == (Character.forDigit(idWanted, 10))) {
                    lastValue = j;
                }
            }

            for (int j = initialValue; j < 200; j++) {
                if (memory[j].charAt(3) == (Character.forDigit(idWanted, 10))) {
                    counter++;
                }
            }

            firstValue = lastValue - counter;
        }

        for (int j = initialValue; j < 200; j++) {
            if (memory[j].charAt(3) == (Character.forDigit(idWanted + 1, 10))) {
                counter2++;
            }
        }

        diffBetweenProcesses = Math.abs(counter - counter2);

        for (int i = firstValue; i < firstValue + counter2 + diffBetweenProcesses + 1; i++) {
            if (memory[i].charAt(3) == (Character.forDigit(idWanted, 10))) {
                memory[i] = aux;
            }
        }

        return firstValue + counter2 + diffBetweenProcesses;
    }

    public void showMemory() {
        String[][] matrixRepresentation = new String[20][10];

        int counterVector = 0;
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 10; col++) {
                matrixRepresentation[row][col] = memory[counterVector];
                counterVector++;
            }
        }

        for (int row = 19; row > 0; row--) {
            for (int col = 9; col > 0; col--){
                System.out.print(matrixRepresentation[row][col] + " ");
            }
            System.out.println();
        }

    }

}
