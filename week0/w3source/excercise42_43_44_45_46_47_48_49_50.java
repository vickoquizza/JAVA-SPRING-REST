import java.io.Console;
import java.util.Scanner;
import java.io.File;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

public class excercise42_43_44_45_46_47_48_49_50{
  public static void main(String args[]){

    //Excercise 42 - How to get a passwor(d from Console
    /*
    Console cons;
    char [] password = null;

    if ((cons = System.console()) != null) {
       password = cons.readPassword("[%s]", "Password:");
    }else {
      System.out.println("Please introduce a password");
    }

    System.out.println(new String(password));
    */

    //Excercise 43
    //System.out.println("Twinkle, twinkle, little star,\n\t\tHow I wonder what you are!\n\t\t\t\tUp above the world so high,\n\t\t\t\tLike a diamond in the sky.\nTwinkle, twinkle, little star,\n\t\tHow I wonder what you are!");

    //Excercise 44
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();

    System.out.printf("%d + %d%d + %d%d%d  \n", number, number, number, number, number, number);

    //Excercise 45
    File aMedir = new File("hola.txt");
    System.out.println("El archivo hola.txt tiene: " + aMedir.length() + "bytes");

    //Excercise 46
    System.out.printf("System time is: %tc%n\n", System.currentTimeMillis());

    //Excercise 47

    SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
    date.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT-5")));

    System.out.println(date.format(System.currentTimeMillis()));


    //Excercise 48
    for(int i = 0; i <= 100; i++){
      if (i % 2 != 0){
        System.out.println(i);
      }
    }

    //Excercise 49
    int evenOrnot = scan.nextInt();

    if( evenOrnot % 2 == 0){
      System.out.println(1);
    }else{
      System.out.println(0);
    }

    //Excercise 50
    Set<Integer> divisibleBy3 = new HashSet<>();
    Set<Integer> divisibleBy5 = new HashSet<>();
    Set<Integer> divisibleBy3And5 = new HashSet<>();

    for(int i = 0; i <= 100; i++){

      if (i % 3 == 0)
        divisibleBy3.add(Integer.valueOf(i));

      if (i % 5 == 0)
        divisibleBy5.add(Integer.valueOf(i));

      if ((i % 3 == 0) && (i % 5 == 0)){
        divisibleBy3And5.add(Integer.valueOf(i));
      }

    }

    System.out.print("Divisible by 3: ");
    for(Integer element : divisibleBy3){
      System.out.print(element + ",");
    }

    System.out.print("Divisible by 5: ");
    for(Integer element : divisibleBy5){
      System.out.print(element + ",");
    }

    System.out.print("Divisible by both: ");
    for(Integer element : divisibleBy3And5){
      System.out.print(element + ",");
    }
  }

}
