package Topic3;

import java.util.function.Function;

public class EvaluatingEuler {
    public static void main(String[] args) {

        System.out.println("TestCases");

        Double eulerDe20 = Euler(20.0, 9);
        Double eulerDe5 = Euler(5.0, 9);
        Double eulerDe05 = Euler(0.5,9);

        System.out.printf("%.4f\n%.4f\n%.4f\n", eulerDe20,eulerDe5,eulerDe05);
    }

    static Integer factorial(int number){
        return (number == 1) ? 1 : number * factorial(number - 1);
    }

    static Double power(Double base, int pow){
        return (pow == 0) ? 1 : base * power(base, pow - 1);
    }

    static Double Euler(Double x, int pow){
        return (pow == 0) ? 1 : power(x,pow)/factorial(pow) +  Euler(x, pow - 1);
    }
}
