package com.vicko.java.Facade;

public class AccountCheck {

    private int accountNumber = 123456789;

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public boolean AccountActive(int accountToCheck){
        if(accountToCheck == getAccountNumber()){
            return true;
        }else {
            return false;
        }
    }

}
