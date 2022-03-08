package com.vicko.Payroll.Repositories;

import com.vicko.Payroll.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
