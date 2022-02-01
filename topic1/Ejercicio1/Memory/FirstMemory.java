package Topic1.Ejercicio1.Memory;


public class FirstMemory implements Memory {
    private int dataGB = 8;
    @Override
    public void setUpMemory() {
        System.out.println("La memoria de su reproductor es de 8 GB!");
    }
}
