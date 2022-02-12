package Topic3;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class EvaluatingEuler {
    static final UnaryOperator<Integer> factorial = number -> (number == 1) ? 1 : number * EvaluatingEuler.factorial.apply(number - 1);
    static final BiFunction<Double, Integer, Double>  power = (base, pow) -> (pow == 0) ? 1 : base * EvaluatingEuler.power.apply(base, pow - 1);
    static final BiFunction<Double, Integer, Double> Euler = (x, pow) -> (pow == 0) ? 1 : power.apply(x,pow)/factorial.apply(pow) +  EvaluatingEuler.Euler.apply(x, pow - 1);

    public static void main(String[] args) {


        System.out.println("TestCases");

        System.out.printf("%.4f\n%.4f\n%.4f\n%.4f\n", Euler.apply(20.0, 9), Euler.apply(5.0, 9),Euler.apply(0.5,9), Euler.apply(-0.5,9));
    }

}
