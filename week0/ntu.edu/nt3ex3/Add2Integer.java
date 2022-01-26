package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class Add2Integer {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scan.nextInt();

        scan.close();

        sum = num1 + num2;
        System.out.println("The sum of the 2 integer es: " + sum);
    }

}
