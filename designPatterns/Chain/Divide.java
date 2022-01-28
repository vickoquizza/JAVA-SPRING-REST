package com.vicko.java.Chain;

public class Divide implements Chain{
    private Chain nextChain;
    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCommand() == "div"){
            int result = request.getNumber1() / request.getNumber2();
            System.out.println(request.getNumber1() +  "/" + request.getNumber2() + " = " + result);
        }else{
            System.out.println("End of the chain only works with add,sub,multiply and div");
        }
    }
}
