package techniques;

public class _Recursion {
    public static void main(String[] args) {
        int factorialDe5 = factorial(5);
        System.out.println(factorialDe5);
    }

    static Integer factorial(int number){
        return (number == 1) ? 1 : number * factorial(number - 1);
    }
}
