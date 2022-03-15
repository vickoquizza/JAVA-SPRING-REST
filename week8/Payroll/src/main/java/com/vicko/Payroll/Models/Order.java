package com.vicko.Payroll.Models;

import com.vicko.Payroll.Utils.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "CUSTOMER_ORDER")
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Status status;

    public Order(String description, Status status){
        this.description = description;
        this.status = status;
    }
}
