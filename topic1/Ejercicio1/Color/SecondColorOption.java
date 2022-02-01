package Topic1.Ejercicio1.Color;

import Topic1.Ejercicio1.Color.Color;

public class SecondColorOption implements Color {
    private String color = "Azul";
    @Override
    public void setupColor() {
        System.out.println("El color de su reproductor es Azul!");
    }
}
