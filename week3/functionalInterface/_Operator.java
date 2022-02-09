package functionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class _Operator {
    public static void main(String[] args) {
        //Un unary operator representa una interfaz funcional que recibe un argumento de un tipo y devuelve un valor del mismo tipo del argumento
        //Es muy util cuando se quieren hacer asignaciones o modificar algun objeto
        UnaryOperator<Integer>  plus4 = number -> number + 4;

        System.out.println(plus4.apply(5));

        Person albert = new Person();

        albert.changeName.apply(albert);

        System.out.println(albert.getName());

        //El binary operator es una interfaz que representa una función que recibe dos argumentos de un mismo tipo y devuelve uno que es del mismo tipo
        // de los argumentos, es ideal para cuando se quieren hacer funciones que representen operaciones especificas entre dos numeros
        BinaryOperator<Integer> integerMultiply = (value1, value2)  -> value1 * value2;

        System.out.println(integerMultiply.apply(2,3));

    }






}

class Person{
    private String name;

    public Person(){

    }

    UnaryOperator<Person> changeName = person -> {
        person.name = "Albert";
        return person;
    };

    public String getName() {
        return name;
    }
}
