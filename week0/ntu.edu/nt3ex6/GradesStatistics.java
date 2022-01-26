package com.vicko.java.nt3ex6;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);


        System.out.print("Input the number of students");
        int NUMBER_OF_ELEMENTS = scan.nextInt();
        int sum = 0;
        int maxNumber = 0;
        int minNumber = 0;


        int[] numbers = new int[NUMBER_OF_ELEMENTS];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++){
            System.out.println("Input a mark for a student: ");
            numbers[i] = scan.nextInt();
        }

        minNumber = numbers[0];

        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++){
            sum += numbers[i];

            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }

            if (numbers[i] < minNumber){
                minNumber = numbers[i];
            }


        }

        System.out.println(" Average mark: " + sum/NUMBER_OF_ELEMENTS);
        System.out.println(" Max mark" +  maxNumber);
        System.out.println(" Min mark" + minNumber);


    }
}
