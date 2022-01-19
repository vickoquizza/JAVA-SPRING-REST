import java.io.Console;
import java.util.Scanner;


public class excercise66to70{
  public static void main(String args[]){
    //Excercise 66
    Scanner scan = new Scanner(System.in);
    /*
    final int LOWER_NUMBER = 1;
    final int MAX_NUMBER = 100;
    int sum = 0;



    for(int i = LOWER_NUMBER; i <= MAX_NUMBER; i++){

      if ((i == 2) || (i == 3)){
        sum += i;
      }

      if (i % i == 0 || i % (i + 2) == 0){
        continue;
      }

      sum += i;

    }

    System.out.println("Sum of the first 100 prime numbers: " + sum);

    */
    //Excercise 67
    String original = "Python 3.0";
    String add = "Tutorial";

    System.out.println(original.substring(0,7) + add + " " + original.substring(7,10));

    //Excercise 68
    String lastThreeCharacters = original.substring(7,10);
    System.out.println(lastThreeCharacters + lastThreeCharacters + lastThreeCharacters + lastThreeCharacters);

    //Excercise 69
    String evenString = scan.nextLine();
    int evenStringLength = evenString.length();

    if (evenStringLength % 2 == 0){
      System.out.println(evenString.substring(0,evenStringLength/2));
    }else{
      System.out.println("Please, input a even string!");
    }

    //Excercise 70
    System.out.print("Str 1: ");
    String str1 = scan.nextLine();
    System.out.print("Str 2: ");
    String str2 = scan.nextLine();

    int str1Length = str1.length();
    int str2Length = str2.length();

    if (str1Length > str2Length){
      System.out.println(str2 + str1 + str2);
    }else {
        System.out.println(str1 + str2 + str1);
    }
  }

}
