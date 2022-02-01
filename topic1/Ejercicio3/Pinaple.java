package Topic1.Ejercicio3;

public class Pinaple extends ToppingDecorator{
    public Pinaple(HotDog tempHotDog) {
        super(tempHotDog);

        System.out.println("Añadiendo los trocitos de piña");
    }

    @Override
    public String addToDescription() {
        return tempHotDog.addToDescription() + ", Capa de piña";
    }
}
