package com.vicko.topic6.Punto1.Generator;

import com.vicko.topic6.Punto1.Models.Bank;
import com.vicko.topic6.Punto1.Models.BankUser;

public interface BankUserGenerator {

    BankUser generateOriginBankUser();

    BankUser generateTargetBankUser();

}
