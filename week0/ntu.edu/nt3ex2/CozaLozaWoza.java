package com.vicko.java.nt3ex2;

public class CozaLozaWoza {
    public static void main(String[] args) {
        final int MAX_NUMBER = 110;


        for (int i = 1; i <= MAX_NUMBER; ++i) {
            if(i % 3 == 0){
                System.out.print("Coza");
            }
            if(i % 5 == 0){
                System.out.print("Loza");
            }
            if(i % 7 == 0){
                System.out.print("Wowza");
            }
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print("CozaLoza");
            }
            if((i % 3 == 0) && (i % 7 == 0)){
                System.out.print("CozaWoza");
            }
            if((i % 5 == 0) && (i % 7 == 0)){
                System.out.print("LozaWoza");
            }
            if((i % 5 == 0) && (i % 7 == 0) && (i % 3 == 0)){
                System.out.print("CozaLozaWoza");
            }
            if((i % 5 != 0) && (i % 7 != 0) && (i % 3 != 0)){
                System.out.print(i);
            }

            if (i % 11 == 0){
                System.out.println();
            }else{
                System.out.print(" ");
            }
        }


    }
}
