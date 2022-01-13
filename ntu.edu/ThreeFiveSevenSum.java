public class ThreeFiveSevenSum{
  public static void main(String args[]){
    int initial = 1;
    final int max = 1000;

    int sum = 0;
    int counter = initial;
    while(counter <=  max){

      if (((counter % 7 == 0) || (counter % 3 == 0) || (counter % 5 == 0)) && ((counter % 15 != 0) || ((counter % 21 != 0) || (counter % 35 != 0) || ((counter % 105 != 0))))){ // This is for see if the number is divisible by 3,5,7 but no by 15,21,35 and 105
        sum += counter;
      }
      ++counter;
    }

    System.out.println("La suma entre los numeros selectos es: " + sum);
  }
}
