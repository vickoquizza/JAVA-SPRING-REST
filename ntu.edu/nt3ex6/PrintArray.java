package com.vicko.java.nt3ex6;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);


        System.out.print("Input the length of the array");
        int NUMBER_OF_ELEMENTS = scan.nextInt();

        int[] numbers = new int[NUMBER_OF_ELEMENTS];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++){
            System.out.println("Input a number: ");
            numbers[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
