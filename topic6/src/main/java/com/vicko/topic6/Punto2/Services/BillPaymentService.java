package com.vicko.topic6.Punto2.Services;

import com.vicko.topic6.Punto1.Exceptions.InsufficientFundsException;
import com.vicko.topic6.Punto1.Generator.BankUserGenerator;
import com.vicko.topic6.Punto1.Models.BankUser;
import com.vicko.topic6.Punto1.Utils.AccountType;
import com.vicko.topic6.Punto2.Exceptions.InvalidBillException;
import com.vicko.topic6.Punto2.ExternalGenerator.BillsGenerator;
import com.vicko.topic6.Punto2.Models.Bills;
import org.springframework.beans.factory.annotation.Autowired;

public class BillPaymentService {

    @Autowired
    private BankUserGenerator bankUserGenerator;

    @Autowired
    private BillsGenerator billsGenerator;

    public void billPayment(){
        BankUser user = bankUserGenerator.generateOriginBankUser();

        Bills bill = billsGenerator.GenerateBill();

        if(correctBillIdCheck(bill)){
            if(enoughFundsToTransaction(user,bill)){
                if(checkIfIsAnCheckingAccount(user)){
                    user.setFunds(user.getFunds() - (bill.getBillPrice() * 0.9 ));
                }else{
                    user.setFunds(user.getFunds() - bill.getBillPrice());
                }
            }else{
                throw new InsufficientFundsException();
            }
        }else{
            throw  new InvalidBillException();
        }


    }

    public boolean enoughFundsToTransaction(BankUser user, Bills bill){
        return (user.getFunds() >= (bill.getBillPrice() + (bill.getBillPrice() * 0.2)));
    }

    public boolean checkIfIsAnCheckingAccount(BankUser user){
        return (user.getAccountType().equals(AccountType.CHECKING));
    }

    public boolean correctBillIdCheck(Bills bill){
        return (bill.getBillId().length() == 7) && (bill.getBillId().startsWith("00"));
    }
}
