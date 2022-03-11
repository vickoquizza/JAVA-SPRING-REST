package com.vicko.SpringMVCWithCRUD.Services;

import com.vicko.SpringMVCWithCRUD.Exceptions.InvoiceNotFoundException;
import com.vicko.SpringMVCWithCRUD.Models.Invoice;
import com.vicko.SpringMVCWithCRUD.Repositories.InvoiceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class InvoiceServiceImpl implements InvoiceServiceInterface{

    private final InvoiceRepository repository;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return repository.save(invoice);
    }

    @Override
    public List<Invoice> getAllInvoice() {
        return repository.findAll();
    }

    @Override
    public Invoice getInvoice(Long invoiceId) {
        return repository.findById(invoiceId).orElseThrow(() -> new InvoiceNotFoundException("Invoice with Id : "+ invoiceId +" Not Found"));
    }

    @Override
    public void deleteInvoice(Long invoiceId) {
        repository.delete(getInvoice(invoiceId));

    }

    @Override
    public void updateInvoice(Invoice invoice) {
        repository.save(invoice);
    }
}
