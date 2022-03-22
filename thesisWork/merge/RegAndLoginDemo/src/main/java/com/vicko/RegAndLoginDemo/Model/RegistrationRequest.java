package com.vicko.RegAndLoginDemo.Model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String firstName;
    private final String lastName;
    private final String identificationNumber;
    private final String address;
    private final String zipCode;
    private final String city;
    private final String state;
    private final String country;
    private final String email;
    private final String password;
}
