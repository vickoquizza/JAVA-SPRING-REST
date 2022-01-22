package com.vicko.java.nt3ex5;

import java.util.Scanner;

public class ExchangeCipher {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int n = 3;
        System.out.print("Enter a string: ");
        char[] inputString = scan.nextLine().toUpperCase().toCharArray();

        for(char element: inputString){
            System.out.print((char)('A' + 'Z' - n));
        }
    }

}
