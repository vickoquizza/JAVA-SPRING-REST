package com.vicko.RegAndLoginDemo.Utils;

import org.springframework.stereotype.Service;

import java.util.function.Predicate;
import java.util.regex.Pattern;

@Service
public class zipCodeValidator implements Predicate<String> {

    @Override
    public boolean test(String zipCode) {
        return Pattern
                .compile("^[0-9]{6}(?:-[0-9]{4})?$")
                .matcher(zipCode)
                .matches();
    }
}
