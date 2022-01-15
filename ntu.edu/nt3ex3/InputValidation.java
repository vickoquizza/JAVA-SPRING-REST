package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number between 0-10 or 90-100: ");
        int number = scan.nextInt();
        boolean isValid = true;

        do{
            if ((number >= 0 && number <= 10) || (number >= 90 && number <= 100)){
                System.out.println(number);
                isValid = false;
            }else{
               isValid = true;
                System.out.print("Enter a number between 0-10 or 90-100: ");
                number = scan.nextInt();
            }
        }while(isValid);



    }
}
