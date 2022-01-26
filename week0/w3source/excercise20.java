import java.util.Scanner;

public class excercise20{
  public static void main(String args[]){
    //20 excercise
    Scanner scan = new Scanner(System.in);
    String hexa = "";
    int counter = 0;
    System.out.println("Input a decimal number");
    char[] aux = new char[20];
    int decimal = scan.nextInt();

    while(decimal != 0){
      if(decimal % 16 == 10){
        hexa += "A";
      } else if(decimal % 16 == 11){
        hexa += "B";
      } else if(decimal % 16 == 12){
        hexa += "C";
      } else if(decimal % 16 == 13){
        hexa += "D";
      } else if(decimal % 16 == 14){
        hexa += "E";
      } else if(decimal % 16 == 15){
        hexa += "F";
      } else {
        hexa += decimal % 16;
      }

      decimal /= 16;



    }

    counter = hexa.length() - 1;
    aux = hexa.toCharArray();

    while(counter >= 0){
     System.out.print(aux[counter--]);
   }


  }
}
