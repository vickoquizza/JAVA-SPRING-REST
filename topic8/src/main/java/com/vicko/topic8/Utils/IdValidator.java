package com.vicko.topic8.Utils;

import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.function.Predicate;

@Component
public class IdValidator implements Predicate<Long> {

    @Override
    public boolean test(Long aLong) {
        return (aLong > 0) && (aLong < 10000);
    }
}
