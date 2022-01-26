package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter income (or -1 to end): ");
        int income = scan.nextInt();
        double realprice = 0.0;
        double tax = 0.0;
        double sum = 0.0;
        double taxSum = 0.0;


        while(income != -1) {
            sum += income;
            realprice = income/(1 + 0.07);
            tax = income - realprice;
            taxSum += tax;

            System.out.println("Real price:" + realprice);
            System.out.println("Tax:" + tax);

            System.out.print("Enter income (or -1 to end): ");
            income = scan.nextInt();
        }
        System.out.println("total outcome:" + sum);
        System.out.println("total tax:" + taxSum);
    }
}
