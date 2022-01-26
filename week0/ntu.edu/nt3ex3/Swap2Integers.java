package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scan.nextInt();

        int aux = 0;

        aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println("After the swap, first integer is: " +  num1 + " ,second integer is: " + num2);
    }
}
