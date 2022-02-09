package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer("Laura");

        //Sin usar el consumer
        greetCostumer(costumer1);

        //Ahora usando el consumer
        greetCostumerToo.accept(costumer1);

        //Ahora usando el biconsumer
        greetAndAssignCostumer.accept(costumer1,"SFX");
    }

    //Un consumer es una interfaz funcional que permite entregar un argumento, pero no devolver ninguno, haciendolo
    //ideal para salidas al usuario o para procesamientos finales
    static Consumer<Costumer> greetCostumerToo = costumer -> System.out.println("Hello costumer " + costumer.name);

    //Un Biconsumer hacer lo mismo pero lo aplica a recibir dos argumentos diferentes
    static BiConsumer<Costumer, String> greetAndAssignCostumer =
            (costumer, department) -> System.out.println("Hey " + costumer.name + ". Now you´re working on the " + department + " department");

    static void greetCostumer(Costumer costumer){
        System.out.println("Hello " +  costumer.name);
    }

    static class Costumer{
        private final String name;

        public Costumer(String name) {
            this.name = name;
        }
    }
}
