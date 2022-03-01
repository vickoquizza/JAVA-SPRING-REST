package com.vicko.JunitAndMockito.Services;

import com.vicko.JunitAndMockito.Utils.RatesResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class RatesService {


    private String accessKey;
    private final RestTemplate restTemplate;


    public RatesService(@Value("${open-exchange-rates.access-key}") String accessKey){
        this.accessKey = accessKey;
        restTemplate = new RestTemplate();
    }

    public Map<String, Number> getRates(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String endpoint =  "/api/historical/" + simpleDateFormat.format(date) + ".json?app_id=" + accessKey;
        RatesResponse result = restTemplate.getForObject("http://openexchangerates.org" + endpoint, RatesResponse.class);
        Map<String, Number> rates = result.getRates();
        return rates;
    }
}
