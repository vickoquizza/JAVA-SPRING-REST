package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the taxable income (or -1 to end): $");
        System.out.print("Enter income : ");
        int num1 = scan.nextInt();
        double aux = 0, aux2 = 0, aux3 = 0;
        double taxToPay = 0.0;

        while (num1 != -1) {

            if (num1 <= 20000) {
                taxToPay = num1 * 0.0;
            } else if (num1 <= 40000) {
                aux = num1 - 20000;
                taxToPay += aux * 0.1;
            } else if (num1 <= 60000) {
                taxToPay += (num1 - 20000) * 0.1 + (num1 - 40000) * 0.2;
            } else {
                taxToPay += (num1 - 20000) * 0.1 + (num1 - 40000) * 0.2 + (num1 - 60000) * 0.3;
            }

            System.out.printf("Tax to pay: %.2f", taxToPay);

            System.out.print("Enter the taxable income (or -1 to end): $");
            System.out.print("Enter income : ");
            num1 = scan.nextInt();
        }

    }
}
