package streams;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Intro2 {
    public static void main(String[] args) {
        //A distintas formas de crear Streams, la primera es mediante hacer una stream vacio
        // -> Esta forma es muy util cuando se quieren evitar que el stream sea null
        Stream<String> emptyStream = Stream.empty();

        //Otra forma de crearlo es a partir de una coleccion(mapa, set o lista)
        Collection<String> letras = Arrays.asList("a", "b", "c");
        Stream<String> deColeccion = letras.stream();

        //Se puede crear a partir de un builder
        Stream<String> conBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        //Se puede hacer mediante el metodo generate(), pero para este se debe indicar un limite de cuanto puede procesar el stream.
        Stream<String> conGenerate = Stream.generate(() -> "Elemento1").limit(10);

        //Se puede crear un stream a partir de el iterate()
        Stream<Integer> conIterate = Stream.iterate(1, n -> n + 1).limit(10);

        //Se pueden crear Streams solo a partir de tres primitivos enteros, doubles y longs, esto se hace con sus propaias interfaces funcionales
        IntStream intStream = IntStream.range(1,2);
        LongStream longStream = LongStream.range(10, 55);

        //Tambien se le puede hacer Stream a un archivo desde Java
        /*Path path = Paths.get("C:\\file.txt");
        Stream<String> streamOfStrings = Files.lines(path);
        Stream<String> streamWithCharset =
                Files.lines(path, Charset.forName("UTF-8"));*/

        //Sin embargo su uso fue diseñado para ser usado de manera pura y funcional por lo que un stream no puede ser usado más de dos veces en tiempo de ejecucion
        //Es por eso que se recomienda usarlo cuando se vaya a hacer el pipeline con la estructura java de preferencia.
    }
}
