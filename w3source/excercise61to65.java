import java.io.Console;
import java.util.Scanner;


public class excercise61to65{
  public static void main(String args[]){
    //Excercise 61
    Scanner scan = new Scanner(System.in);
    System.out.print("Imput a string: ");
    String input = scan.nextLine();

    for (int i = input.length() - 1; i >= 0; i--){
      System.out.print(input.charAt(i));
    }

    //Excercise 62

    /*
    System.out.print("Imput 1 int: ");
    int num1 = scan.nextInt();
    System.out.print("Imput 2 int: ");
    int num2 = scan.nextInt();
    System.out.print("Imput 3 int: ");
    int num3 = scan.nextInt();

    boolean condition = ((Math.abs(num1 - num2) >= 20) || (Math.abs(num2 - num3) >= 20) || (Math.abs(num1 - num3) >= 20));

    System.out.println("The result is: " + condition);
    */

    //Excercise 63

    /*
    System.out.print("Imput 1 int: ");
    int num1 = scan.nextInt();
    System.out.print("Imput 2 int: ");
    int num2 = scan.nextInt();

    int largerNumber = num1;
    int smallest = num2;


    if(num1 == num2){
      largerNumber = 0;
    }if (num2 > largerNumber){
      largerNumber = num2;
      smallest = num1;
    }
    if((num1 %  6 == num2 % 6)){
      largerNumber = smallest;
    }

    System.out.print("Result: " + largerNumber);

    */

    //Excercise 64

    /*
    final int LOW_NUMBER = 25;
    final int MAX_NUMBER = 75;
    System.out.print("Imput 1 int: ");
    int num1 = scan.nextInt();
    System.out.print("Imput 2 int: ");
    int num2 = scan.nextInt();
    boolean thereShareDigits = false;

    if((num1 < LOW_NUMBER) || (num1 > MAX_NUMBER) || (num2 < LOW_NUMBER) || (num2 > MAX_NUMBER)){
      thereShareDigits = false;
    }

    while((num1 != 0) || (num2 != 0)){
      thereShareDigits = (num1 % 10 == num2 % 10) ? true : false;
      num1 /= 10;
      num2 /= 10;
    }

    System.out.print("Result: " + thereShareDigits);

    */

    //Excercise 65
    System.out.print("Imput 1 int: ");
    int num1 = scan.nextInt();
    System.out.print("Imput 2 int: ");
    int num2 = scan.nextInt();
    int module = 0;

    int ressult = num1/num2;

    module = num1 - (ressult * num2);

    System.out.print("Result: " + module);

  }

}
