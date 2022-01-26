package com.vicko.java.nt3ex2;

public class ComputePI {
    public static void main(String[] args){
        final int MAX_NUMBER = 1000000;
        double pi = 0.0;
        double sum = 0.0;
        double errorPercentage = 0.0;


        for(int i = 1; i <= MAX_NUMBER; i += 2){
            if(i % 4 == 1){
                sum += 1/i;
            }else if (i % 4 == 3){
                sum -= 1/i;
            }else{
                System.out.println("Not possible!");
            }
        }

        pi = 4 * sum;
        errorPercentage = (pi/Math.PI) * 100;

        System.out.println("Pi is: " + pi);
        System.out.println("Error percentage is: " + errorPercentage);


    }
}
