package com.vicko.topic8.DTO;

import com.vicko.topic8.Models.Book;
import com.vicko.topic8.Utils.OrderStatus;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class OrderDTO {
        private Long id;
        private Long bookId;
        private int quantity;
        private Date shipDate;
        private OrderStatus status;
        private boolean complete;
}
