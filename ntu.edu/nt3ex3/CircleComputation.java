package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius = scan.nextDouble();
        double diameter = 2.0 * radius;
        double circumference = 2.0 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("El diametro es: %.2f", diameter);
        System.out.printf("La circunferencia es: %.2f", circumference);
        System.out.printf("El area es: %.2f", area);

    }
}
