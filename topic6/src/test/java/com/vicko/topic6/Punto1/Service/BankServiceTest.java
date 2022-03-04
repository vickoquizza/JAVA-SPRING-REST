package com.vicko.topic6.Punto1.Service;

import com.vicko.topic6.Punto1.Exceptions.InsufficientFundsException;
import com.vicko.topic6.Punto1.Exceptions.InvalidTargetFundsException;
import com.vicko.topic6.Punto1.Generator.BankUserGenerator;
import com.vicko.topic6.Punto1.Models.Bank;
import com.vicko.topic6.Punto1.Models.BankUser;
import com.vicko.topic6.Punto1.Utils.AccountType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.*;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    @Mock
    private BankUserGenerator bankUserGenerator;

    @InjectMocks
    private BankService bankService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void makeTransactionWithAnotherBank(){
        BankUser originUser = BankUser.builder()
                .accountType(AccountType.SAVINGS)
                .firstName("Mario")
                .LastName("Mario")
                .funds(10000.0)
                .bank(Bank.builder().bankName("Globant").id(5).build())
                .build();

        BankUser targetUser = BankUser.builder()
                .accountType(AccountType.SAVINGS)
                .firstName("Luigi")
                .LastName("Mario")
                .funds(1000)
                .bank(Bank.builder().bankName("HSBC").id(3).build())
                .build();

        Mockito.when(bankUserGenerator.generateOriginBankUser()).thenReturn(originUser);
        Mockito.when(bankUserGenerator.generateTargetBankUser()).thenReturn(targetUser);

        bankService.calculate(6000);

        assertAll(
                () -> assertEquals(500, originUser.getFunds()),
                () -> assertEquals(7000, targetUser.getFunds())
        );
    }

    @Test
    public void checkingFunds() {
        BankUser originUser = BankUser.builder()
                .accountType(AccountType.SAVINGS)
                .firstName("Mario")
                .LastName("Mario")
                .funds(9000.0)
                .bank(Bank.builder().bankName("Globant").id(5).build())
                .build();

        BankUser targetUser = BankUser.builder()
                .accountType(AccountType.SAVINGS)
                .firstName("Luigi")
                .LastName("Mario")
                .funds(1000)
                .bank(Bank.builder().bankName("HSBC").id(3).build())
                .build();

        Mockito.when(bankUserGenerator.generateOriginBankUser()).thenReturn(originUser);
        Mockito.when(bankUserGenerator.generateTargetBankUser()).thenReturn(targetUser);

        InsufficientFundsException ex = assertThrows(InsufficientFundsException.class, () -> bankService.calculate(6000));

        assertEquals("Insufficient funds in the origin account to do a transaction", ex.getMessage());
    }

    @Test
    public void checkCheckingAccountException() {
        BankUser originUser = BankUser.builder()
                .accountType(AccountType.SAVINGS)
                .firstName("Mario")
                .LastName("Mario")
                .funds(10000.0)
                .bank(Bank.builder().bankName("Globant").id(5).build())
                .build();

        BankUser targetUser = BankUser.builder()
                .accountType(AccountType.CHECKING)
                .firstName("Luigi")
                .LastName("Mario")
                .funds(20000)
                .bank(Bank.builder().bankName("HSBC").id(3).build())
                .build();

        Mockito.when(bankUserGenerator.generateOriginBankUser()).thenReturn(originUser);
        Mockito.when(bankUserGenerator.generateTargetBankUser()).thenReturn(targetUser);

        InvalidTargetFundsException ex = assertThrows(InvalidTargetFundsException.class, () -> bankService.calculate(6000));

        assertEquals("The target account would have less than triple of the value of the transaction", ex.getMessage());
    }


    @Test
    public void BigTransactionsTest(){
        BankUser originUser = BankUser.builder()
                .accountType(AccountType.SAVINGS)
                .firstName("Mario")
                .LastName("Mario")
                .funds(10000000.0)
                .bank(Bank.builder().bankName("Globant").id(5).build())
                .build();

        BankUser targetUser = BankUser.builder()
                .accountType(AccountType.SAVINGS)
                .firstName("Luigi")
                .LastName("Mario")
                .funds(100000)
                .bank(Bank.builder().bankName("Globant").id(5).build())
                .build();

        Mockito.when(bankUserGenerator.generateOriginBankUser()).thenReturn(originUser);
        Mockito.when(bankUserGenerator.generateTargetBankUser()).thenReturn(targetUser);

        bankService.calculate(1600000);

        assertAll(
                () -> assertEquals(8400000, originUser.getFunds()),
                () -> assertEquals(1220000, targetUser.getFunds())
        );
    }




}