package com.vicko.java.nt3ex6;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String args[]) {
        final String[] HEX = {"0", "1", "2", "3",
                "4", "5", "6", "7",
                "8", "9", "A",
                "B", "C", "D", "E", "F"};
        //20 excercise
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a decimal number");
        int decimal = scan.nextInt();

        while(decimal != 0){
            System.out.print(HEX[decimal % 16]);
            decimal /= 10;
        }
    }

}
