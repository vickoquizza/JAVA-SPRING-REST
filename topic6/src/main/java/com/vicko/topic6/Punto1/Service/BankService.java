package com.vicko.topic6.Punto1.Service;

import com.vicko.topic6.Punto1.Exceptions.InsufficientFundsException;
import com.vicko.topic6.Punto1.Exceptions.InvalidTargetFundsException;
import com.vicko.topic6.Punto1.Generator.BankUserGenerator;
import com.vicko.topic6.Punto1.Models.BankUser;
import com.vicko.topic6.Punto1.Utils.AccountType;
import org.springframework.beans.factory.annotation.Autowired;

public class BankService {

    @Autowired
    private BankUserGenerator bankUserGenerator;

    public void calculate(double fundsToTransaction){
        BankUser originUser = bankUserGenerator.generateOriginBankUser();
        BankUser targetUser = bankUserGenerator.generateTargetBankUser();

        double taxes = 0;

        if(fundsToTransaction > 1500000){
            taxes = fundsToTransaction * 0.3;
        }

        if(checkIfEnoughFundsToTransaction(originUser,checkIfTheAccountIsFromAnotherBank(targetUser), fundsToTransaction)){
            if (checkTargetCheckingAccountCondition(targetUser, fundsToTransaction)){
                if(!checkIfTheAccountIsFromAnotherBank(targetUser)){
                    originUser.setFunds(originUser.getFunds() - fundsToTransaction - 3500);
                    targetUser.setFunds(targetUser.getFunds() + fundsToTransaction - taxes);
                }else{
                    originUser.setFunds(originUser.getFunds() - fundsToTransaction);
                    targetUser.setFunds(targetUser.getFunds() + fundsToTransaction- taxes);
                }
            }else{
                throw new InvalidTargetFundsException();
            }
        }else {
            throw new InsufficientFundsException();
        }


    }

    private boolean checkIfEnoughFundsToTransaction(BankUser originAccount, boolean isToAnotherBank, double fundsToTransaction){
        double ifTargetIsFromAnotherBank = originAccount.getFunds() - (fundsToTransaction + 3500);
        if(!isToAnotherBank){
            return (originAccount.getFunds() > fundsToTransaction) && (ifTargetIsFromAnotherBank > 0);
        }else{
            return (originAccount.getFunds() > fundsToTransaction) && ((originAccount.getFunds() - fundsToTransaction) > 0);
        }

    }

    private boolean checkIfTheAccountIsFromAnotherBank(BankUser account){
        return (account.getBank().getId() == 5) && (account.getBank().getBankName() == "Globant");
    }

    private boolean checkTargetCheckingAccountCondition(BankUser targetAccount, double fundsToTransaction){
        if(targetAccount.getAccountType() == AccountType.CHECKING){
            if(targetAccount.getFunds() > (fundsToTransaction*3)){
                return false;
            }else{
                return true;
            }
        }else{
            return true;
        }
    }
}
