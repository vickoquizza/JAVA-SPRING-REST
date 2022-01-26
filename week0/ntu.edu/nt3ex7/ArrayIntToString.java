package com.vicko.java.nt3ex7;

public class ArrayIntToString {

    public static void main(String args[]){
        String prueba = "";

        int[] array = {1,24,5,6};

        prueba = toString(array);

        System.out.println(prueba);

    }

    public static String toString(int[] array){
        String result = "";
        if(array == null){
            System.out.print("this array is empty");
        }else{
            result += "[";
            for(int i = 0; i < array.length; i++){
                result += String.valueOf(array[i]) + ",";
                if (i == array.length - 1){
                    continue;
                }
            }
            result += "]";
        }
        return result;
    }
}
