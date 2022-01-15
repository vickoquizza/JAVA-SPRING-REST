package com.vicko.java.nt3ex2;

public class ExtractDigits {
    public static void main(String[] args){
        int number = 165433;
        int digit = 0;

        while (number > 0){
            digit = number % 10;
            System.out.print(digit + " ");
            number /= 10;
        }
    }
}
