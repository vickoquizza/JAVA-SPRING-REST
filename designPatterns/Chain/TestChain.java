package com.vicko.java.Chain;

public class TestChain {

    public static void main(String args[]){
        Chain chainCalculator = new Add();
        Chain chainCalculator2 = new Rest();
        Chain chainCalculator3 = new Multiply();
        Chain chainCalculator4 = new Divide();

        chainCalculator.setNextChain(chainCalculator2);
        chainCalculator2.setNextChain(chainCalculator3);
        chainCalculator3.setNextChain(chainCalculator4);

        Numbers addObject = new Numbers(2,5,"module");

        chainCalculator.calculate(addObject);
    }
}
