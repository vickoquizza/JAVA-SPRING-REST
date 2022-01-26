package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int product = 0;
        int min = 0;
        int max = 0;

        System.out.print("Enter first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scan.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = scan.nextInt();

        scan.close();

        sum = num1 + num2 + num3;
        System.out.println("The sum is: " + sum);
        product = num1 * num2 * num3;
        System.out.println("The product is: " + product);

        min = num1;
        if (min > num2){
            min = num2;
        }
        if (min > num3){
            min = num3;
        }

        max = num3;
        if (max < num2){
            max = num2;
        }
        if (max < num3){
            min = num3;
        }

        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);

    }


}
