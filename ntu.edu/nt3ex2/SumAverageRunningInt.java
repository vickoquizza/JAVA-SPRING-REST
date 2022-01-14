package com.vicko.java.nt3ex2;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int lowNumber = 1;
        int maxNumber = 100;
        int sum = 0;
        double average;

        for(int i = lowNumber; i <= maxNumber; i++){
            sum += i;
        }

        average = sum/maxNumber;

        System.out.println("The sum of the number between " + lowNumber + " and " + maxNumber + " is " + sum);
        System.out.println("The average is: " + average);

    }
}
