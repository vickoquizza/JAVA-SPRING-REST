package com.vicko.java.nt3ex5;

import java.util.Scanner;

public class TestPalindromicWord {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int n = 3;
        System.out.print("Enter a string: ");
        String inputString = scan.nextLine().toUpperCase();
        int fordWard = 0;
        int backWard = inputString.length() - 1;
        boolean state = true;

        while(fordWard < backWard){
            if (inputString.charAt(fordWard) != inputString.charAt(backWard)){
                state = false;
            }
            fordWard++;
            backWard--;
        }

        System.out.println("The word is adapted?: " + state);

    }
}
