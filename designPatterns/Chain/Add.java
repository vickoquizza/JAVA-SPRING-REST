package com.vicko.java.Chain;

public class Add implements Chain{

    private Chain nextChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCommand() == "sum"){
            int result = request.getNumber1() + request.getNumber2();
            System.out.println(request.getNumber1() +  "+" + request.getNumber2() + " = " + result);
        }else{
            nextChain.calculate(request);
        }
    }
}
