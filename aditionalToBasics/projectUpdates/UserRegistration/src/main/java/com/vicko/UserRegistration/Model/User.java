package com.vicko.UserRegistration.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

    private UUID id;
    private String username;


    private String name;
    private String lastName;

    private String address;
    private String zipCode;

    private String city;
    private String state;
    private String country;

    public User(@JsonProperty("id") UUID id, @JsonProperty("username") String username,  @JsonProperty("name") String name, @JsonProperty("lastName") String lastName, @JsonProperty("address") String address, @JsonProperty("zipCode") String zipCode, @JsonProperty("city") String city, @JsonProperty("state") String state,  @JsonProperty("country") String country) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }


    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }
}
