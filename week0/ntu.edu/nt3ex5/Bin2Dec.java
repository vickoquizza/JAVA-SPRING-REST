package com.vicko.java.nt3ex5;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        int binNumber = Integer.parseInt(input);
        int pow = 1;
        int resto = 0;
        int decimalNumber = 0;

        while(binNumber != 0){
            resto = binNumber % 10;
            decimalNumber = decimalNumber + resto*pow;
            pow *= 2;
            binNumber /= 10;
        }

        System.out.println(decimalNumber);
    }
}
