package com.vicko.java.nt3ex4;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        System.out.println("A");

        for (int row = 1; row <= size; row++){

            for (int col = 1; col <= row; col++){
                if (row >= col){
                    System.out.print(col + "");
                }else{
                    System.out.print(" ");
                }
                if (col == row){
                    System.out.println();
                }
            }
        }

        System.out.println("B");

        for (int row = size -1; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();

        }



        System.out.println("C");

        for (int row = 1; row <= size; row++){

            for (int col = 1; col <= row; col++){
                if (row <= col){
                    System.out.print(col + "");
                }else{
                    System.out.print(" ");
                }
                if (col == row){
                    System.out.println();
                }
            }
        }

        System.out.println("D");

        for (int row = size ; row >= 1; row--){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();

        }

    }
}
