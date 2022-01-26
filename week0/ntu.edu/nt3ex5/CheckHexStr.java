package com.vicko.java.nt3ex5;

import java.util.Scanner;

public class CheckHexStr {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scan.nextLine().toUpperCase();
        char[] inputString = input.toCharArray();
        String isHexa = "";

        for(char element: inputString){
            if (!((element >= '0' && element <= '9') || (element >= 'A' && element <= 'F'))){
                isHexa = "NOT";
            }
        }

        System.out.println(input + " is " + isHexa + " Hexadecimal");




    }
}
