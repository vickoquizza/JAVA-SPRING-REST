package com.vicko.topic8.Models;

import com.vicko.topic8.Utils.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Orders")
public class Order {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private int quantity;
    private Date shipDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private boolean complete = false;
}
