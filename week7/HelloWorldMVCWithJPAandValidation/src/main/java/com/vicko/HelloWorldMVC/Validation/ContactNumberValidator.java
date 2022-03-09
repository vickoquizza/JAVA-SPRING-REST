package com.vicko.HelloWorldMVC.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {


    @Override
    public void initialize(ContactNumberConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s != null && s.matches("[0-9]+") && (s.length() > 8) && (s.length() < 14);
    }
}
