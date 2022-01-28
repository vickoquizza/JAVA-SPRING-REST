package com.vicko.java.Chain;

public class Numbers {
    private int number1;
    private int number2;

    private String command;

    public Numbers(int number1, int number2, String command){
        this.number1 = number1;
        this.number2 = number2;
        this.command = command;
    }

    public int getNumber1(){
        return this.number1;
    }

    public int getNumber2(){
        return this.number2;
    }

    public String getCommand(){
        return this.command;
    }
}
