package com.vicko.topic6.Punto1.Models;

import com.vicko.topic6.Punto1.Utils.AccountType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BankUser {

    private AccountType accountType;
    private String firstName;
    private String LastName;
    private double funds;

    private Bank bank;
}
