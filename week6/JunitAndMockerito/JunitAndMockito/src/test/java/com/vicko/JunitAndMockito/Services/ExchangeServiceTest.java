package com.vicko.JunitAndMockito.Services;

import com.vicko.JunitAndMockito.Utils.CurrencyEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class ExchangeServiceTest {

    @Test
    public void ShouldConvertEuroToGbp(){
        RatesService ratesService = Mockito.mock(RatesService.class);
        Map<String, Number> rates = new HashMap<>();
        rates.put(CurrencyEnum.EUR.toString(), 0.84);
        rates.put(CurrencyEnum.GBP.toString(), 0.75);
        when(ratesService.getRates(any())).thenReturn(rates);

        ExchangeService exchangeService = new ExchangeService(ratesService);
        Date today= new Date();
        Assertions.assertEquals(89.29, exchangeService.convert(CurrencyEnum.EUR, CurrencyEnum.GBP,
                today, 100));
    }

}