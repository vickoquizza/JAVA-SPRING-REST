package com.vicko.java.Facade;

public class SecurityCodeCheck {
    private int securityCode = 1234;

    public int getSecurityCode(){
        return this.securityCode;
    }

    public boolean checkSecurityCode(int securityCodeToCheck){
        if(securityCodeToCheck == getSecurityCode()){
            return true;
        }else{
            return false;
        }
    }
}
