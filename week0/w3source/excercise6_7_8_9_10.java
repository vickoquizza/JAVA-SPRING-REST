import java.util.Scanner;

public class excercise6_7_8_9_10{
  public static void main(String args[]){
    //Sixth excercise
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingress your first number: ");

    int num1 = scan.nextInt();
    System.out.println("Ingress your second number: ");
    int num2 = scan.nextInt();

    int sum = num1 + num2;
    int rest = num1 - num2;
    int product = num1 * num2;
    int divide = num1 / num2;
    int module = num1 % num2;

    System.out.println(num1 + "+" + num2 + "=" + sum);
    System.out.println(num1 + "-" + num2 + "=" + rest);
    System.out.println(num1 + "*" + num2 + "=" + product);
    System.out.println(num1 + "/" + num2 + "=" + divide);
    System.out.println(num1 + "%" + num2 + "=" + module);

    //Seventh excercise
    System.out.println("Wich number do you want to know it product table?");
    int productNumber = scan.nextInt();
    int pro = 0;
    for(int i = 0; i <= 10; i++){
      pro = productNumber * i;
      System.out.println(productNumber + " X " + i + " = " + pro);
    }

    //Eight excercise
    System.out.println("   J    A   V     V  A\n   J   A A   V   V  A A\nJ  J  AAAAA   V V  AAAAA\n JJ  A     A   V  A     A");

    //Ninth excercise
    System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

    //Tenth excercise
    System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
  }
}
