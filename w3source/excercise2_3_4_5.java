import java.util.Scanner;

public class excercise2_3_4_5{
  public static void main(String args[]){
    //Second excercise
    System.out.println(74 + 36);

    //Third excercise
    System.out.println(50/3);

    //Fourth excercise
    int firstOp = -5 + 8 * 6;
    int secondOp = (55+9) % 9;
    int thirdOp = 20 + (-3)*5/8;
    int fourthOp = 5 + 15 / 3 * 2 - 8 % 3;
    System.out.println(firstOp + "," + secondOp + "," + thirdOp + "," + fourthOp);


    //Fifth excercise
    Scanner sca = new Scanner(System.in); // We make a instance of the scanner class, that help us to bring user inputs to the program
    System.out.println("First number: ");

    int num1 = sca.nextInt();
    System.out.println("Second number: ");
    int num2 = sca.nextInt();
    int product = num1* num2;
    System.out.println("Your Result: " + product);
  }
}
