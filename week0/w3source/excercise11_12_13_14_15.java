import java.util.Scanner;

public class excercise11_12_13_14_15{
  public static void main(String args[]){
    //Eleventh excercise
    final float PI = 3.141516F;
    float radius = 7.5F;

    float area = PI * radius * radius;
    float perimeter = 2 * PI * radius;

    System.out.println("Perimeter is = " + perimeter);
    System.out.println("Area is = " + area);

    //12 excercise
    Scanner scan = new Scanner(System.in);

    double num1 = scan.nextDouble();
    double num2 = scan.nextDouble();
    double num3 = scan.nextDouble();

    double average = (num1 + num2 + num3)/3.0;

    System.out.println(average);

    //13 excercise
    float width = 5.5F;
    float height = 8.5F;

    float squareArea = width * height;
    float squarePerimeter = 2 * (width + height);

    System.out.println("area is " + width + "*" + height + "=" + squareArea);
    System.out.println("Perimeter is 2*" + "(" + width + "+" + height + ")" + "=" + squarePerimeter);

    //14 excercise
    System.out.println("");
    System.out.println("* * * * * * ================================== ");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ================================== ");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ================================== ");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ================================== ");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ================================== ");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");

    //15 excercise
    System.out.println("Input the fisrt variable: ");
    int aNumber = scan.nextInt();
    System.out.println("Input the second variable: ");
    int bNumber = scan.nextInt();

    int temporal = bNumber;
    bNumber = aNumber;
    aNumber = temporal;

    System.out.println("Now the first variable is:" + aNumber + "and the second one is:" + bNumber);


  }
}
