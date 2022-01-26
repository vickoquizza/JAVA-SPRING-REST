package com.vicko.java.nt3ex4;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        for (int row = 1; row <= size; row++){

            for (int col = 1; col <= size; col++){
                System.out.print("# ");
                if (col == size){
                    System.out.println();
                }
            }
        }
    }
}
