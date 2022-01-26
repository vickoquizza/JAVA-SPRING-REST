package com.vicko.java.nt3ex7;

import java.util.Scanner;

public class MagicNum {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number or -1 to end: ");
        int inputNumber = scan.nextInt();
        int sum = 0;

        while(inputNumber != -1){

            if(hasEight(inputNumber)){
                sum += inputNumber;
            }else{
                System.out.println(inputNumber + " Does not have a 8");
            }

            System.out.print("Enter a number or -1 to end: ");
            inputNumber = scan.nextInt();
        }
        System.out.println("The Magic sum is " + sum);


    }

    public static boolean hasEight(int number){
        boolean isTrue = false;
        while(number != 0){
            if(number % 10 == 8){
                isTrue = true;
            }

            number /= 10;
        }
        return isTrue;
    }
}
