package Topic1.Ejercicio3;

public class Beacon extends ToppingDecorator{
    public Beacon(HotDog tempHotDog) {
        super(tempHotDog);

        System.out.println("Añadiendo la tocineta");
    }


    @Override
    public String addToDescription() {
        return tempHotDog.addToDescription() + ", Tocineta";
    }
}
