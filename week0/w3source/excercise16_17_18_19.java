import java.util.Scanner;

public class excercise16_17_18_19{
  public static void main(String args[]){
    //16 excercise
    System.out.println(" +\"\"\"\"\"+\n[| o o |]\n |  ^  | \n | '-' | \n +-----+ ");

    //17-18  excercise
    Scanner scan = new Scanner(System.in);
    int counter = 0;
    int carry = 0;
    int[] suma = new int[15];
    int bin1 = scan.nextInt();
    int bin2 = scan.nextInt();

    while (bin1 != 0 || bin2 != 0){
      suma[counter] = (bin1 % 10 + bin2 % 10 + carry) % 2;
      carry = (bin1 % 10 + bin2 % 10 + carry) / 2;
      bin1 /= 10;
      bin2 /= 10;
      counter++;
    }

    if (carry != 0){
      suma[counter++] = carry;
    }

    --counter;

    while(counter >= 0){
      System.out.print(suma[counter--]);
    }

    //19 excercise
    System.out.println("Insert a decimal number");
    int decimal = scan.nextInt();
    int[] binary = new int[20];
    
    int c = 0;

    while(decimal != 0){
      binary[c++] = decimal % 2;
      decimal /= 2;

    }

    while(c >= 0){
      System.out.print(binary[c--]);
    }
    
  }
}
