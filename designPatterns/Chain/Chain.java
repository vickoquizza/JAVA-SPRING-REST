package com.vicko.java.Chain;

public interface Chain {
    public void setNextChain(Chain nextChain);

    public void calculate(Numbers request);
}
