package com.vicko.java.nt3ex5;

import java.util.Arrays;
import java.util.Scanner;

public class CheckBinStr {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scan.nextLine().toUpperCase();
        char[] inputString = input.toCharArray();
        String isBinarian = "";

        for(char element: inputString){
            if (!(element == '1' || element == '0')){
                isBinarian = "NOT";
            }
        }

        System.out.println(input + " is " + isBinarian + " binarian");




    }
}
