package com.vicko.java.nt3ex2;

public class Product1ToN {
    public static void main(String[] args) {
        int lowNumber = 1;
        int maxNumber = 10;
        long product = 1;

        for(int i = lowNumber; i <= maxNumber; i++){
            product = product*i;
        }



        System.out.println("The factorial of " + maxNumber + " is "+ product);

    }
}
