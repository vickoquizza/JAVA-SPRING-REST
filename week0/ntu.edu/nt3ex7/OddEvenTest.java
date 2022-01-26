package com.vicko.java.nt3ex7;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int inputNumber = scan.nextInt();

        if(isOdd(inputNumber)){
            System.out.println(inputNumber + " Is an odd number");
        }else{
            System.out.println(inputNumber + " Is not an odd number");
        }

    }

    public static boolean isOdd(int number){
        boolean isTrue;
       if(number % 2 == 0){
           isTrue = true;
       }else{
           isTrue = false;
       }
       return isTrue;
    }
}
