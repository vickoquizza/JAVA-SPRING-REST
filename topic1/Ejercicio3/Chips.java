package Topic1.Ejercicio3;

public class Chips extends ToppingDecorator{

    public Chips(HotDog tempHotDog) {
        super(tempHotDog);

        System.out.println("Añadiendo el ripio");
    }

    @Override
    public String addToDescription() {
        return tempHotDog.addToDescription() + ", Capa de ripio";
    }
}
