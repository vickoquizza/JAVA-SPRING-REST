package com.vicko.java.Facade;

public class BankAccountFacade {
    private int accountNumber;
    private int securityCode;

    AccountCheck accCheck;

    SecurityCodeCheck securityCheck;

    FundsCheck funds;

    WelcomeToBank welcomeToBank;

    public BankAccountFacade(int newAccountNumber, int newSecurityCode){
        this.accountNumber = newAccountNumber;
        this.securityCode = newSecurityCode;

        accCheck = new AccountCheck();
        securityCheck = new SecurityCodeCheck();
        funds = new FundsCheck();
        welcomeToBank = new WelcomeToBank();

    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public int getSecurityCode(){
        return this.securityCode;
    }

    public void withDrawCash(double cashToWithdrawn){
        if(accCheck.AccountActive(getAccountNumber()) && securityCheck.checkSecurityCode(getSecurityCode()) && funds.hasEnoughCash(cashToWithdrawn)){
            System.out.println("Transaction complete");
        }else{
            System.out.println("Transaction Failed");
        }
    }

    public void depositCash(double cashtoDeposit){
        if(accCheck.AccountActive(getAccountNumber()) && securityCheck.checkSecurityCode(getSecurityCode())){
            funds.makeDeposit(cashtoDeposit);
            System.out.println("Deposit made");
        }else{
            System.out.println("Failed to made a deposit");
        }
    }
}
