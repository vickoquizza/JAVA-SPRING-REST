package com.vicko.java.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);



        try {
            System.out.print("Enter a whole number to divide: ");
            int x = scan.nextInt();

            System.out.print("Enter a whole number to divide by: ");
            int y = scan.nextInt();

            int z = x / y;

            System.out.println("Result is: " + z);
        }catch(ArithmeticException e) {
            System.out.println("You can´t divide by 0");
        }catch (InputMismatchException e){
            System.out.println("Please enter a number");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }finally{
            scan.close();
            System.out.println("The code is done");
        }

    }
}
