import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class memoria {
    private static String[] memory = new String[200];
    private static int id = 1;


    public static void main(String args[]){
        memoria Mem = new memoria();

        Mem.initializationMemory();

        int memoryPosicion = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Seleccione un comando o -1 para terminar el proceso");
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
                    Mem.deleteProccess(Character.getNumericValue(input.charAt(1)));
                    Mem.showMemory();
                } else {
                    System.out.println("Invalid input!");
                }
            }catch (Exception e){
                System.out.println("There is an Exception: " + e);
            }finally {
                System.out.print("Seleccione un comando o -1 para terminar el proceso");
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
                if (id > 9 && id <= 99){
                    memory[i] = "s" + "0" + id;
                }else if(id > 99){
                    memory[i] = "s" +  id;
                }
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
                if (id > 9 && id <= 99){
                    memory[i] = "a" + "0" + id;
                }else if(id > 99){
                    memory[i] = "a" +  id;
                }
                positionTaken++;
            }
            id++;
        }
        return positionTaken;
    }

    public void deleteProccess(int idWanted){
        List<String> toDelete = new LinkedList<>(Arrays.asList(memory));
        int deleteCounter = 0;
        int memoryCounter = 0;

        for (int i = toDelete.size() - 1; i >= 0 ; i--){
            if(toDelete.get(i).charAt(3) == Character.forDigit(idWanted, 10)){
                toDelete.remove(i);
                deleteCounter++;
            }
        }

        String[] auxiliarMemory = new String[toDelete.size()];
        auxiliarMemory = toDelete.toArray(auxiliarMemory);

        for (int i = 0; i < 200; i++){
            memory[i] = "****";
        }

        for (int i = 0; i < auxiliarMemory.length; i++){
            memory[i] = auxiliarMemory[i];
        }

        for (int i = 0; i < 200; i++){
            if (memory[i] == "****"){
                memoryCounter++;
            }
        }

        System.out.println(200 - memoryCounter);
    }

    public void showMemory() {
        String[][] matrixRepresentation = new String[20][10];
        int vectorCounter = 0;
        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 10; col++) {
                matrixRepresentation[row][col] = memory[vectorCounter];
                vectorCounter++;
            }
        }

        for (int row = 0; row < 20; row++) {
            for (int col = 0; col < 10; col++){
                System.out.print(matrixRepresentation[row][col] + " ");
            }
            System.out.println();
        }

    }

}