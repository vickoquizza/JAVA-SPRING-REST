import java.util.Scanner;

public class excercise26_27_28_29_30{
  public static void main(String args[]){
    //excercise 26
    /*
    Scanner scan = new Scanner(System.in);
    int octal = scan.nextInt();
    int decimal = octaltoDecimal(octal);
    int[] binary = new int[20];

    int c = 0;

    while(decimal != 0){
      binary[c++] = decimal % 2;
      decimal /= 2;

    }

    c--;

    while(c >= 0){
      System.out.print(binary[c--]);
    }


    //excercise 27
    Scanner scan = new Scanner(System.in);
    int octal = scan.nextInt();
    int decimal = octaltoDecimal(octal);

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



   //excercise 28
   Scanner scan = new Scanner(System.in);
   String hexa = scan.nextLine();
   hexa = hexa.toUpperCase();
   String base = "0123456789ABCDEF";
   int decimal = 0;

   for(int i = 0; i <= hexa.length() - 1;i++){
     char aux = hexa.charAt(i);
     int decimalValue = base.indexOf(aux);
     decimal = decimal*16 + decimalValue;
   }

   System.out.println(decimal);



  //excercise 29
  Scanner scan = new Scanner(System.in);
  String hexa = scan.nextLine();
  int decimal = hexaToDecimal(hexa);
  int[] binary = new int[20];

    int c = 0;

    while(decimal != 0){
      binary[c++] = decimal % 2;
      decimal /= 2;

    }

    c--;

    while(c >= 0){
      System.out.print(binary[c--]);
    }
  */
  Scanner scan = new Scanner(System.in);
  String hexa = scan.nextLine();
  int decimal = hexaToDecimal(hexa);
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

  }

  static public int hexaToDecimal(String hexa){
    hexa = hexa.toUpperCase();
    String base = "0123456789ABCDEF";
    int decimal = 0;

    for(int i = 0; i <= hexa.length() - 1;i++){
      char aux = hexa.charAt(i);
      int decimalValue = base.indexOf(aux);
      decimal = decimal*16 + decimalValue;
    }

    return decimal;


  }



  static public int octaltoDecimal(int octal){
    int resto;
    int j = 1;
    int decimalNumber = 0;

    while(octal != 0){
      resto = octal % 10;
      decimalNumber = decimalNumber + resto*j;
      j *= 8;
      octal /= 10;
    }

    return decimalNumber;

 }



}
