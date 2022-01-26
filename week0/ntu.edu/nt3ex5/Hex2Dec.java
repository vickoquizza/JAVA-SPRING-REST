package com.vicko.java.nt3ex5;

import java.util.Scanner;

public class Hex2Dec {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scan.nextLine().toUpperCase();
        String base = "0123456789ABCDEF";
        int decimal = 0;

        for(int i = 0; i <= input.length() - 1;i++){
            char aux = input.charAt(i);
            int decimalValue = base.indexOf(aux);
            decimal = decimal*16 + decimalValue;
        }
        System.out.println(decimal);

    }
}
