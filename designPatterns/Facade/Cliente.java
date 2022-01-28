package com.vicko.java.Facade;

public class Cliente {
    public static void main(String args[]){
        BankAccountFacade bankAccount = new BankAccountFacade(123456789, 1234);

        bankAccount.withDrawCash(50.00);

        bankAccount.depositCash(200.00);
    }
}
