package Topic1.Ejercicio1.Memory;

public class SecondMemory implements Memory {
    private int dataGB = 16;
    @Override
    public void setUpMemory() {
        System.out.println("La memoria de su reproductor es de 16 GB!");
    }
}
