package Topic1.Ejercicio3;

public class Sauces extends ToppingDecorator{
    public Sauces(HotDog tempHotDog) {
        super(tempHotDog);

        System.out.println("Añadiendo las salsas");
    }

    @Override
    public String addToDescription() {
        return tempHotDog.addToDescription() + ", Capa de salsas";
    }
}
