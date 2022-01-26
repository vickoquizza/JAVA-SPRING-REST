package com.vicko.java.nt3ex7;

public class Printing {
    public static void main(String args[]){
        int[] number = null;

        print(number);
    }

    public static void print(int[] array){
        if(array == null){
            System.out.print("this array is empty");
        }else{
            System.out.print("[");
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i] + ",");
            }
            System.out.print("]");
        }
    }
}
