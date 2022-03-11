package com.vicko.SpringMVCWithCRUD.Services;

import com.vicko.SpringMVCWithCRUD.Models.Invoice;

import java.util.List;

public interface InvoiceServiceInterface {

    public Invoice saveInvoice(Invoice invoice);
    public List<Invoice> getAllInvoice();
    public Invoice getInvoice(Long invoiceId);
    public void deleteInvoice(Long invoiceId);
    public void updateInvoice(Invoice invoice);

}
