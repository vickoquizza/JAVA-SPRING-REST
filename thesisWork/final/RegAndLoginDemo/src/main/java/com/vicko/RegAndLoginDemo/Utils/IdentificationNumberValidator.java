package com.vicko.RegAndLoginDemo.Utils;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@Service
public class IdentificationNumberValidator implements Predicate<String> {
    @Override
    public boolean test(String identificationNumber) {
        return Pattern
                .compile("^[0-9]{10}$")
                .matcher(identificationNumber)
                .matches();
    }
}
