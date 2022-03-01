package com.vicko.JunitAndMockito.Services;

import com.vicko.JunitAndMockito.Utils.CurrencyEnum;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Map;

public class ExchangeService {


    private RatesService ratesService;

    public ExchangeService(RatesService ratesService){
        this.ratesService = ratesService;
    }

    public Number convert(CurrencyEnum fromCur, CurrencyEnum toCur, Date date, Number value) {
        Map<String, Number> rates = ratesService.getRates(date);
        Number baseValue = value.doubleValue() / rates.get(fromCur.toString()).doubleValue();
        Number convertedValue = baseValue.doubleValue() * rates.get(toCur.toString()).doubleValue();
        return Math.round(convertedValue.doubleValue()*100)/100.0d;
    }


}
