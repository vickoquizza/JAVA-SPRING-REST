package techniques;

import java.util.function.Function;

public class _FunctionComposition {
    public static void main(String[] args) {
        Function<Double, Double> sqrt = number -> Math.sqrt(number);
        Function<Double, Double> log = number -> Math.log(number);

        //Hacemos una función compuesta de otras menores
        Function<Double, Double> sqrtAfterLog = sqrt.compose(log);

        System.out.println(sqrtAfterLog.apply(3.1416));

        //Se puede hacer en el orden que se desee
        Function<Double, Double> logAfterSqrt = log.compose(sqrt);

        System.out.println(logAfterSqrt.apply(3.1416));
    }


}
