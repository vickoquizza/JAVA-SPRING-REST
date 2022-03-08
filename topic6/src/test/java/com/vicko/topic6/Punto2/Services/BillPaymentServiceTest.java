package com.vicko.topic6.Punto2.Services;

import com.vicko.topic6.Punto1.Exceptions.InsufficientFundsException;
import com.vicko.topic6.Punto1.Generator.BankUserGenerator;
import com.vicko.topic6.Punto1.Models.Bank;
import com.vicko.topic6.Punto1.Models.BankUser;
import com.vicko.topic6.Punto1.Utils.AccountType;
import com.vicko.topic6.Punto2.Exceptions.InvalidBillException;
import com.vicko.topic6.Punto2.ExternalGenerator.BillsGenerator;
import com.vicko.topic6.Punto2.Models.Bills;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class BillPaymentServiceTest {

    @Mock
    private BankUserGenerator userGenerator;

    @Mock
    private BillsGenerator billsGenerator;

    @InjectMocks
    private BillPaymentService billPaymentService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void checkingAccountCondition(){
        BankUser originUser = BankUser.builder()
                .accountType(AccountType.CHECKING)
                .firstName("Mario")
                .LastName("Mario")
                .funds(10000.0)
                .bank(Bank.builder().bankName("Globant").id(5).build())
                .build();

        Bills bill = Bills.builder()
                .companyId(6)
                .billId("0078345")
                .billDueDate("24-03-2022")
                .billPrice(700.0)
                .build();

        Mockito.when(userGenerator.generateOriginBankUser()).thenReturn(originUser);
        Mockito.when(billsGenerator.GenerateBill()).thenReturn(bill);

        billPaymentService.billPayment();

        assertEquals(9370, originUser.getFunds());
    }

    @Test
    public void checkIfThereAreEnoughFunds(){
        BankUser originUser = BankUser.builder()
                .accountType(AccountType.CHECKING)
                .firstName("Mario")
                .LastName("Mario")
                .funds(830.0)
                .bank(Bank.builder().bankName("Globant").id(5).build())
                .build();

        Bills bill = Bills.builder()
                .companyId(6)
                .billId("0078345")
                .billDueDate("24-03-2022")
                .billPrice(700.0)
                .build();

        Mockito.when(userGenerator.generateOriginBankUser()).thenReturn(originUser);
        Mockito.when(billsGenerator.GenerateBill()).thenReturn(bill);


        InsufficientFundsException ex = assertThrows(InsufficientFundsException.class, () -> billPaymentService.billPayment());

        assertEquals("Insufficient funds in the origin account to do a transaction", ex.getMessage());

    }

    @Test
    public void CheckIfIdIsCorrect(){
        BankUser originUser = BankUser.builder()
                .accountType(AccountType.SAVINGS)
                .firstName("Mario")
                .LastName("Mario")
                .funds(850.0)
                .bank(Bank.builder().bankName("Globant").id(5).build())
                .build();

        Bills bill = Bills.builder()
                .companyId(6)
                .billId("78345")
                .billDueDate("24-03-2022")
                .billPrice(700.0)
                .build();

        Mockito.when(userGenerator.generateOriginBankUser()).thenReturn(originUser);
        Mockito.when(billsGenerator.GenerateBill()).thenReturn(bill);

        InvalidBillException ex = assertThrows(InvalidBillException.class, () -> billPaymentService.billPayment());

        assertEquals("The bill id must start with '00' and have 7 digits", ex.getMessage());

    }
}