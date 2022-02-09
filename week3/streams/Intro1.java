package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intro1 {
    public static void main(String[] args) {
        //Para crear un stream se puede hacer de la siguiente manera

        String[] names = new String[]{"Vicko", "Mark", "Jack", "Juan"};
        Stream<String> stream = Arrays.stream(names);
        stream = Stream.of("Vicko", "Mark", "Jack");

        //Para iterar Stream nos sirve y buscar cosas en una lista
        List<String> namesArray = Arrays.asList(names);
        //Para encontrar si un elemento se encuentra en una lista
        boolean isMarkPresent = namesArray.stream().anyMatch(name -> name.startsWith("Mark"));

        System.out.println(isMarkPresent);

        //Por ejemplo para hacer un filtrado y elaborar otra coleeción de dichos elementos
        List<String> elementosConA = namesArray
                .stream()
                .filter(name -> name.toLowerCase().contains("a"))
                .collect(Collectors.toList());

        System.out.println(elementosConA);

        //Tambien se puede usar map(), que sirve para transformar todos los elementos de un stream, pero sobre esa tranformación tiene que haber que quedar el mismo numero de entradas como de salidas.
        List<String> elementosMayus = namesArray.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(elementosMayus);

        //Tambien nos sirve para reducir colecciones a una minima expresión
        List<Integer> marks = Arrays.asList(2,4,5,7,10);
        Integer reduce = marks.stream().reduce(0, (acumulator, number) -> acumulator + number);
        System.out.println(reduce.intValue());

    }
}
