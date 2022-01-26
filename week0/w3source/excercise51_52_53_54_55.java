import java.io.Console;
import java.util.Scanner;


public class excercise51_52_53_54_55{
  public static void main(String args[]){
    //Excercise 51

    Scanner scan = new Scanner(System.in);
    /*
    String aCambiar = scan.nextLine();

    int number = Integer.parseInt(aCambiar);

    System.out.println("La cadena ahora es un entero: " + number);
    */

    //Excercise 52

    /*
      System.out.print("Input the first number : ");
      int num1 = scan.nextInt();
      System.out.print("Input the second number : ");
      int num2 = scan.nextInt();
      System.out.print("Input the third number : ");
      int num3 = scan.nextInt();
      boolean equals = false;

      int sum = num1 + num2;

      if (sum == num3){
        equals = true;
      }else{
        equals = false;
      }
      System.out.println("The result is: " + equals);

      */

      //Excercise 53

      /*
      System.out.print("Input the first number : ");
      int num1 = scan.nextInt();
      System.out.print("Input the second number : ");
      int num2 = scan.nextInt();
      System.out.print("Input the third number : ");
      int num3 = scan.nextInt();
      System.out.print("is ABC true?  (respond y o n): ");
      char getABC = scan.next().charAt(0); //Como obtener un character desde la consola

      boolean accomplished = false;


      if (getABC == 'y'){
        if (num3 > num2){
          accomplished = true;
        }else{
          accomplished = false;
        }
      }else{
        if ((num2 > num1) && (num3 > num2)){
          accomplished = true;
        }else{
          accomplished = false;
      }
    }


      System.out.println("The result is: " + accomplished);

      */

      //Excercise 54

      /*
      System.out.print("Input the first number : ");
      int num1 = scan.nextInt();
      System.out.print("Input the second number : ");
      int num2 = scan.nextInt();
      System.out.print("Input the third number : ");
      int num3 = scan.nextInt();

      boolean accomplished = false;

      if ((num1 % 10 == num2 % 10) || (num2 % 10 == num3 % 10) || (num1 % 10 == num3 % 10)){
        accomplished = true;
      }else {
        accomplished = false;
      }

        System.out.println("The result is: " + accomplished);

    */

        //Excercise 55
        System.out.print("Input the seconds : ");
        int num1 = scan.nextInt();
        int horas = 0;
        int minutos = num1 / 60;
        int segundos = num1%60;

        if(minutos >= 60){
          horas = minutos/60;
          minutos = horas%60;
        }else{
          horas = 0;
        }

        System.out.printf("%d:%d:%d", horas, minutos, segundos);



  }

}
