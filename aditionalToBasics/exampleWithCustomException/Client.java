package com.vicko.java.exampleWithCustomException;

import java.util.Scanner;

public class Client {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        }catch(Exception e){
            System.out.println("A problem occured: "  + e);
        }

    }

    public static void checkAge(int age) throws AgeException{

            if (age < 18){
                throw new AgeException("Invalid age!");
            }else{
                System.out.println("You're now signed off!");
            }
    }
}
