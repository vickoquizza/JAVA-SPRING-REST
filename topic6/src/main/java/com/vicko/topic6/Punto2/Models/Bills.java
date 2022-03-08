package com.vicko.topic6.Punto2.Models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bills {
    private int companyId;
    private String billId;
    private String billDueDate;
    private Double billPrice;
}
