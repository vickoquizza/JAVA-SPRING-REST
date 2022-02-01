package Topic1.Ejercicio1.Color;

import Topic1.Ejercicio1.Color.Color;

public class FirstColorOption implements Color {
    private String color = "Verde";
    @Override
    public void setupColor() {
        System.out.println("El color de su reproductor es Verde!");
    }
}
