import java.util.Scanner;

public class excercise31_32_33_34_35{
  public static void main(String args[]){
    //Excercise 31
    System.out.println("Java Version: " + System.getProperty("java.version"));
    System.out.println("Java Runtime Version: " + System.getProperty("java.version.date"));
    System.out.println("Java Home: " + System.getProperty("java.home"));
    System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
    System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
    System.out.println("Java class path: " + System.getProperty("java.class.path"));

    //Excercise 32
    /*
    Scanner scan = new Scanner(System.in);
    System.out.println("Input your first number");
    int number1 = scan.nextInt();
    System.out.println("Input your second number");
    int number2 = scan.nextInt();

    if (number1 == number2)
      System.out.println(number1 + "==" + number2);
    if (number1 != number2)
      System.out.println(number1 + "!=" + number2);
    if (number1 <= number2)
        System.out.println(number1 + "<=" + number2);
    if (number1 >= number2)
        System.out.println(number1 + ">=" + number2);
    if (number1 < number2)
        System.out.println(number1 + "<" + number2);
    if (number1 > number2)
        System.out.println(number1 + ">" + number2);
    */

    //Excercise 33
    Scanner scan = new Scanner(System.in);
    String numScanned = scan.nextLine();
    int sum = 0;

    for(int i = 0; i <= numScanned.length() - 1; i++){
      char aux = numScanned.charAt(i);
      int currentNum = Character.getNumericValue(aux);
      sum += currentNum;
    }

    System.out.println(sum);

    //Excercise 34
    /*
    System.out.println("Input length of a side of the hexagon");
    double side = scan.nextDouble();
    final double PI = 3.141516;

    double area = (6 * (side*side))/(4*Math.tan(PI/6));
    System.out.println("The area of the hexagon is: " + area);
    */

    //Excercise 35
    System.out.println("Input length of a side of the polygon ");
    double side = scan.nextDouble();
    System.out.println("Input number of sides of the polygon ");
    double n = scan.nextDouble();

    final double PI = 3.141516;

    double area = (6 * (side*side))/(4*Math.tan(PI/n));
    System.out.println("The area of the hexagon is: " + area);

  }

}
