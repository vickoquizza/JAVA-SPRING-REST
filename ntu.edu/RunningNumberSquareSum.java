public class RunningNumberSquareSum{
  public static void main(String args[]){
    int initial = 1;
    final int max = 100;

    int sum = 0;
    int counter = initial;
    while(counter <=  max){
      sum = counter*counter + sum;

      ++counter;
    }

    System.out.println("La suma entre los numeros de 1 y 1000 es" + sum);
  }
}
