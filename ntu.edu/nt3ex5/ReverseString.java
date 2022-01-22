package com.vicko.java.nt3ex5;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scan.nextLine();

        System.out.print("The reverse of the String " + inputString + "is ");

        for(int i = inputString.length() - 1 ; i >= 0; i--){
            System.out.print(inputString.charAt(i));
        }

    }
}
