package com.vicko.java.nt3ex6;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String args[]){
        final String[] HEX_BITS = {"0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"};

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scan.nextLine().toUpperCase();
        String base = "0123456789ABCDEF";
        int decimal = 0;

        for(int i = 0; i <= input.length() - 1;i++){
            char aux = input.charAt(i);
            int decimalValue = base.indexOf(aux);
            System.out.print(HEX_BITS[decimalValue]+ " ");
        }
    }

}
