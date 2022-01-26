package com.vicko.java.nt3ex7;

import java.util.Scanner;

public class Exponent {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int base = scan.nextInt();
        int exponent = scan.nextInt();

        System.out.printf("%d elevado a la %d, es %d", base, exponent, exponent(base,exponent));
    }

    public static int exponent(int base, int exponent){
        int product = 1;

        for(int i = 0; i < exponent; i++){
            product *= base;
        }

        return product;
    }
}
