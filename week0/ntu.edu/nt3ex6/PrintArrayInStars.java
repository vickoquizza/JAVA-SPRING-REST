package com.vicko.java.nt3ex6;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);


        System.out.print("Input the length of the array");
        int NUMBER_OF_ELEMENTS = scan.nextInt();

        int[] numbers = new int[NUMBER_OF_ELEMENTS];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++){
            System.out.println("Input a number: ");
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++){
            System.out.print(i + ":");
            for(int j = 0; j < numbers[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
