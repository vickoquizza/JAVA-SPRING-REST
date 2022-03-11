package com.vicko.SpringMVCWithCRUD.Repositories;

import com.vicko.SpringMVCWithCRUD.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
