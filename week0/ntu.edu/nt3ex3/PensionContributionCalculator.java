package com.vicko.java.nt3ex3;

import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter income : ");
        int income = scan.nextInt();
        System.out.print("Enter age : ");
        int age = scan.nextInt();
        double employerPension = 0.0, employeePension = 0.0, totalPension = 0.0;

        if (age <= 55){
            employerPension = income*0.17;
            employeePension = income*0.2;
        }else if ((age > 55) && (age <= 60)){
            employerPension = income*0.13;
            employeePension = income*0.13;
        }else if ((age > 60) && (age <= 65)){
            employerPension = income*0.9;
            employeePension = income*0.705;
        }else if (age > 65){
            employerPension = income*0.705;
            employeePension = income*0.5;
        }else {
            System.out.println("Put a value age");
        }

        totalPension = employeePension + employerPension;

        System.out.println("employee pension " + employeePension);
        System.out.println("employer pension " + employerPension);
        System.out.println("total pension " + totalPension);

    }
}
