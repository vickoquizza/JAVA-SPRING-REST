package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Integer to reverse ");
        int number = scan.nextInt();
        int digit = 0;

        while (number > 0){
            digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }
    }
}
