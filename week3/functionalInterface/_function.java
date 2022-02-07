package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _function {
    public static void main(String[] args) {
        int increment = increment(0);

        //Usando una funcion convencional
        System.out.println(increment);

        //Usando una funcion con notación funcional
        int increment2 = incrementBy1.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);

        //Encadenando dos funciones
        Function<Integer, Integer> incrementAndMultiply =  incrementBy1.andThen(multiplyBy10);
        System.out.println(incrementAndMultiply.apply(1));

        //Ejemplos de Bifunciones
        int nuevoNum = multiplyByAny(1,20);
        System.out.println(nuevoNum);

        //Mediante la programación funcional
        int nuevoNum2 = incrementOneAndMultiplyByAny.apply(1,20);
        System.out.println(nuevoNum2);
    }

    static Function<Integer, Integer>  incrementBy1 = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10 = number -> number*10;

    static BiFunction<Integer, Integer, Integer> incrementOneAndMultiplyByAny = (number, numberToMuliply) -> (number + 1) * numberToMuliply;
    static int increment(int number){
        return number + 1;
    }

    static int multiplyByAny(int number, int numToMultiply){
        return (number + 1) * numToMultiply;
    }
}
