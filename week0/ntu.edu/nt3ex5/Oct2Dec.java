package com.vicko.java.nt3ex5;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a octal number: ");
        int input = scan.nextInt();
        String base = "0123456789ABCDEF";
        int resto;
        int j = 1;
        int decimalNumber = 0;

        while(input != 0){
            resto = input % 10;
            decimalNumber = decimalNumber + resto*j;
            j *= 8;
            input /= 10;
        }

        System.out.println(decimalNumber);

    }
}
