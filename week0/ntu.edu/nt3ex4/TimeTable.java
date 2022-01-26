package com.vicko.java.nt3ex4;

import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        System.out.print("* | ");
        for (int i = 1; i <= size; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int j = 1; j <= size + 2; j++) {
            System.out.print("- ");
        }

        System.out.println();

        for (int row = 1; row <= size; row++){
            System.out.print(row + " | ");
            for (int col = 1; col <= size; col++){
                System.out.print((row*col) + " ");
                if (col == size){
                    System.out.println();
                }
            }


        }


    }
}
