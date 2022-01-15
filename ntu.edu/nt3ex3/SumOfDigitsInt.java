package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class SumOfDigitsInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sum to integer");
        int number = scan.nextInt();
        int digit = 0;
        int sum = 0;

        while (number > 0){
            digit = number % 10;
            sum += digit;
            number /= 10;
        }

        System.out.println("The sum is: " + sum);
    }
}
