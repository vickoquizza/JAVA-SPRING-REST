package Topic1.Ejercicio3;


public class CoreHotDog implements HotDog {

    @Override
    public String addToDescription() {
        System.out.println("Sacando el pan y la salchicha");
        return "Pan, Salchicha";
    }

}
