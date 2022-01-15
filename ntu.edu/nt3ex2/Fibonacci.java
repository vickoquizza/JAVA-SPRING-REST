package com.vicko.java.nt3ex2;

public class Fibonacci {
    public static void main(String[] args) {
        final int N_MAX = 20;
        final double N_AVERAGE = 20.0;
        int fn1 = 1;
        int fn2 = 1;
        int fn;
        int n = 3;
        int sumFibonacci = fn1 + fn2;
        double average = 0.0;

        System.out.println("Fibonacci de: " + N_MAX );

        while(n <= N_MAX + 2){
            System.out.print(fn2 + " ");
            fn = fn1 + fn2;
            n++;
            fn2 = fn1;
            fn1 = fn;
            sumFibonacci += fn;
        }

        average = sumFibonacci/N_AVERAGE;

        System.out.println("The average of the sum of the fibonacci series is:" + average);


    }
}