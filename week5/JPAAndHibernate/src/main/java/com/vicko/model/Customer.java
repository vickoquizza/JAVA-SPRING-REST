package com.vicko.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "customerID" , unique = true)
    private int id;

    @Column(name = "firstname" , nullable = false)
    private String firstname;

    @Column(name = "secondname" , nullable = false)
    private  String secondname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
}
