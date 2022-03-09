package com.vicko.HelloWorldMVC.Models;

import com.vicko.HelloWorldMVC.Validation.ContactNumberConstraint;

public class Phone {

    @ContactNumberConstraint
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
