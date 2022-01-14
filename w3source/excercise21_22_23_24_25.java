import java.util.Scanner;

public class excercise21_22_23_24_25{
  public static void main(String args[]){
    //21 excercise
    /*
    Scanner scan = new Scanner(System.in);
    int decimal = scan.nextInt();
    int counter = 0;
    int[] octanumber = new int[20];

    while(decimal != 0){
      octanumber[counter++] = decimal % 8;
      decimal /= 8;
    }

    counter--;

    while(counter >= 0){
      System.out.print(octanumber[counter--]);
    }


    //excercise 22
    Scanner scan = new Scanner(System.in);
    int binary = scan.nextInt();
    int resto;
    int j = 1;
    int decimalNumber = 0;

    while(binary != 0){
      resto = binary % 10;
      decimalNumber = decimalNumber + resto*j;
      j *= 2;
      binary /= 10;
    }

    System.out.println(decimalNumber);


    //excercise 23
    Scanner scan = new Scanner(System.in);
    int binary = scan.nextInt();
    int decimal = binaryToDecimal(binary);
    int counter = 0;
    String hexa = "";
    char[] aux = new char[20];

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



   //excercise 24
   Scanner scan = new Scanner(System.in);
   int binary = scan.nextInt();
   int decimal = binaryToDecimal(binary);
   int counter = 0;
   int[] octanumber = new int[20];

   while(decimal != 0){
     octanumber[counter++] = decimal % 8;
     decimal /= 8;
   }

   counter--;

   while(counter >= 0){
     System.out.print(octanumber[counter--]);
   }
*/

  //excercise 25
  Scanner scan = new Scanner(System.in);
  int octal = scan.nextInt();
  int resto;
  int j = 1;
  int decimalNumber = 0;

  while(octal != 0){
    resto = octal % 10;
    decimalNumber = decimalNumber + resto*j;
    j *= 8;
    octal /= 10;
  }

  System.out.println(decimalNumber);

  }



  static public int binaryToDecimal(int binary){
    int resto;
    int j = 1;
    int decimalNumber = 0;

    while(binary != 0){
      resto = binary % 10;
      decimalNumber = decimalNumber + resto*j;
      j *= 2;
      binary /= 10;
    }

    return decimalNumber;
  }

}
