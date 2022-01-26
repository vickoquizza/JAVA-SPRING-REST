import java.io.Console;
import java.util.Scanner;


public class excercise71to75{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    //Excercise 71
    System.out.print("Str 1: ");
    String str1 = scan.nextLine();
    System.out.print("Str 2: ");
    String str2 = scan.nextLine();

    int str1Length = str1.length();
    int str2Length = str2.length();

    if (str1Length > 1 && str2Length > 1){
      System.out.println(str1.substring(1,str1Length) + str2.substring(1,str2Length));
    }else {
        System.out.println("Input valid value next time");
    }

    //Excercise 72
    System.out.println("String reply: ");
    System.out.print("Str 3: ");
    String str3 = scan.nextLine();


    int str3Length = str3.length();

    if (str3Length > 3){
      System.out.println(str3.substring(0,3));
    }else if (str3Length == 2){
        System.out.println(str3.substring(0,2) + "#");
    }else if (str3Length == 1){
        System.out.println(str3.charAt(0) + "##");
    }else{
      System.out.println("###");
    }

    //Excercise 73
    System.out.print("Str 4: ");
    String str4 = scan.nextLine();
    System.out.print("Str 5: ");
    String str5 = scan.nextLine();

    int str4Length = str4.length();
    int str5Length = str5.length();

    if (str4Length > 0 || str5Length > 0){
      System.out.println(str4.charAt(0) + str5.charAt(str5Length - 2));
    }else {
        System.out.println(str4.charAt(0) + str5.charAt(str5Length - 2) + "#");
    }

    //Excercise 74
    int[] arrayOfNumbers = {0, -20, 0, 30, 40, 50, 60};

    System.out.println((arrayOfNumbers[0] == 10) || (arrayOfNumbers[arrayOfNumbers.length - 1] == 10));

    //Excercise 75
    int[] arrayofNumbers2 = {50, 46, 67, 89, 99, 50};

    System.out.println((arrayofNumbers2[0] == arrayofNumbers2[arrayofNumbers2.length - 1]) || (arrayofNumbers2[arrayofNumbers2.length - 1] == arrayofNumbers2[0]));

  }

}
