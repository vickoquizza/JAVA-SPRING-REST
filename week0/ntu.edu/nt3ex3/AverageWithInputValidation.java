package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        final double NUMBER_STUDENTS_DOUBLE = 3.0;
        final int NUMBER_STUDENTS = 3;
        Scanner scan = new Scanner(System.in);;

        int number = 0;
        int sum = 0;
        double average = 0.0;
        boolean isValid;

        for (int i = 1; i < NUMBER_STUDENTS;i++){
            isValid = false;

            do{
                if ((number > 0 && number <= 100)){
                    isValid = true;
                }else{
                    isValid = false;
                    System.out.printf("Enter a number between 0-100 for Student %d: ", i);
                    number = scan.nextInt();
                }
            }while(!isValid);

            sum += number;

        }

        average = sum/NUMBER_STUDENTS_DOUBLE;

        System.out.println("The average mark is: " + average);

    }
}
