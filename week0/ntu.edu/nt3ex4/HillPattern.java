package com.vicko.java.nt3ex4;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        System.out.println("A");

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if ((row + col) >= size + 1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row >= col){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                if (col == size){
                    System.out.println();
                }
            }

        }

        System.out.println("B");

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if (row <= col){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if ((row + col) <= size + 1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                if (col == size){
                    System.out.println();
                }
            }

        }

        System.out.println("C");

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if ((row + col) >= size + 1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row >= col){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                if (col == size){
                    System.out.println();
                }
            }

        }

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if (row <= col){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if ((row + col) <= size + 1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                if (col == size){
                    System.out.println();
                }
            }

        }

        System.out.println("D");

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if ((row + col) <= size + 1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row <= col){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                if (col == size){
                    System.out.println();
                }
            }

        }

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if (row >= col){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if ((row + col) >= size + 1){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
                if (col == size){
                    System.out.println();
                }
            }

        }




    }
}
