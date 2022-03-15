package com.vicko.Payroll.Repositories;

import com.vicko.Payroll.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
