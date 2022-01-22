package com.vicko.java.nt3ex5;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scan.nextLine().toLowerCase();
        double sumOfDigits = 0;
        double sumOfVowels = 0;
        double averageVowels = 0.0;
        double averageDigits = 0.0;

        for(int i = 0; i < inputString.length(); i++){
            char characterAtString = inputString.charAt(i);
            if (Character.isAlphabetic(characterAtString)){
                if ((characterAtString == 'a') || (characterAtString == 'e') || (characterAtString == 'o') || (characterAtString == 'i') || (characterAtString == 'u') ) {
                    sumOfVowels++;
                }
            }

            if (Character.isDigit(characterAtString)){
                sumOfDigits++;
            }
        }

        averageVowels = sumOfVowels/inputString.length() * 100.0;
        averageDigits = sumOfDigits/inputString.length() * 100.0;

        System.out.println("Average of vowels: " + averageVowels);
        System.out.println("Average of digits: " + averageDigits);
    }

}
