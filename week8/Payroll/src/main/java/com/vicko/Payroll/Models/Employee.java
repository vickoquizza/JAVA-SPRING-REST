package com.vicko.Payroll.Models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@EqualsAndHashCode
@ToString
@Entity
@NoArgsConstructor
public class Employee{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String role;

    public Employee(String firstName, String lastName,  String role){
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public void setName(String name){
        String[] fNameAndLName = name.split(" ");
        this.firstName = fNameAndLName[0];
        this.lastName = fNameAndLName[1];
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }
}
