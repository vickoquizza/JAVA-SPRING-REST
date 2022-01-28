package com.vicko.java.Facade;

public class FundsCheck {

    private double cashInAAccount = 200.0;

    public double getCashInAAccount(){
        return this.cashInAAccount;
    }

    public void decreaseCash(double cashWithdrawn){
        this.cashInAAccount -= cashWithdrawn;
    }

    public void increaseCash(double cashWithdrawn){
        this.cashInAAccount += cashWithdrawn;
    }

    public boolean hasEnoughCash(double cashToWithdrawal){
        if(cashToWithdrawal > getCashInAAccount()){
            System.out.println("There is no enough money in your account to Withdraw");
            System.out.println("Current Balance" + getCashInAAccount());
            return false;
        }else{
            decreaseCash(cashToWithdrawal);
            System.out.println("Current Balance" + getCashInAAccount());
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit){
        increaseCash(cashToDeposit);
        System.out.println("Deposit complete: Current Balance is " + getCashInAAccount());
    }
}
