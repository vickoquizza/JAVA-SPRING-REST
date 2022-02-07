package techniques;

import java.util.function.Function;

public class _Currying {
    public static void main(String[] args) {
        //En currying damos a las funciones un argumento variable que puede cambiar la manera en que la función actua

        Function<Double, Function<Double, Double>> weight = mass -> gravity -> mass * gravity;

        Function<Double, Double> weightOnEarth = weight.apply(9.81);
        System.out.println(weightOnEarth.apply(90.0));

        //Ahora si queremos tener otra función con un atributo gravity distinto
        Function<Double, Double> weightOnMercury = weight.apply(3.7);
        System.out.println(weightOnMercury.apply(90.0));

    }
}
