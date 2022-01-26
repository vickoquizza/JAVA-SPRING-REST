import java.io.Console;
import java.util.Scanner;


public class excercise56to60{
  public static void main(String args[]){
    //Excercise 56
    Scanner scan = new Scanner(System.in);
    int x = 5;
    int y = 20;
    int p = 3;
    int totalIntegers = 0;

    System.out.println("Numbers between " + x + " and " + y + " divisible for " + p);

    for(int i = x; i <= y; i++){
      if(i % p == 0){
        totalIntegers++;
      }
    }

    System.out.print("Number of integers: " + totalIntegers);

    //Excercise 57
    /*
    System.out.println("Number yo want to know the factors ");
    int numberToFactor = scan.nextInt();

    int counter = 0;

    for(int i = 1; i <= (int)Math.sqrt(numberToFactor); i++){
      if ((numberToFactor % i == 0) && (i*i != numberToFactor)){
        counter += 2;
      }else if (i*-i == numberToFactor){
        counter++;
      }
    }


    System.out.println("Number of factors: " + counter);

    */

    //Excercise 58

    /*
    String toEachUpperCase = scan.nextLine();
    String[] eachUpperCaseSplitted = toEachUpperCase.split(" ");
    char aux;

    for(int element = 0; element <= eachUpperCaseSplitted.length - 1; element++){
      aux = eachUpperCaseSplitted[element].charAt(0);
      eachUpperCaseSplitted[element] = eachUpperCaseSplitted[element].replace(eachUpperCaseSplitted[element].charAt(0), Character.toUpperCase(aux));
      System.out.print(eachUpperCaseSplitted[element] + " ");
    }

    */

    //Excercise 59

    /*
    System.out.print("Input a string: ");
    String toEachLowerCase = scan.nextLine();
    String lowered = toEachLowerCase.toLowerCase();

    System.out.println(lowered);

    */

    //Excercise 60
    System.out.print("Input a string: ");
    String toPenultimateWord = scan.nextLine();
    String[] toPenultimateWordSplitted = toPenultimateWord.split(" ");

      System.out.println("Penultimate Word: " + toPenultimateWordSplitted[toPenultimateWordSplitted.length - 2]);

  }

}
