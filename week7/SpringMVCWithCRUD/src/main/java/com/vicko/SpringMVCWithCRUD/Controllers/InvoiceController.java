package com.vicko.SpringMVCWithCRUD.Controllers;

import com.vicko.SpringMVCWithCRUD.Exceptions.InvoiceNotFoundException;
import com.vicko.SpringMVCWithCRUD.Models.Invoice;
import com.vicko.SpringMVCWithCRUD.Services.InvoiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private InvoiceServiceImpl invoiceService;

    @GetMapping("/")
    public String getHomePage(){
        return "homePage";
    }

    @GetMapping("/register")
    public String getRegisterPage(){
        return "registerInvoicePage";
    }

    @PostMapping("/save")
    public String saveInvoice(@ModelAttribute Invoice invoice, Model model){
        invoiceService.saveInvoice(invoice);
        Long invoiceID = invoiceService.saveInvoice(invoice).getId();
        String message = "Record with id : '"+ invoiceID + "' is saved successfully !";
        model.addAttribute("message", message);
        return "registerInvoicePage";
    }

    @GetMapping("/getAllInvoices")
    public String getAllInvoices(
            @RequestParam(value = "message", required = false) String message,
            Model model
    ) {
        List<Invoice> invoices= invoiceService.getAllInvoice();
        model.addAttribute("list", invoices);
        model.addAttribute("message", message);
        return "allInvoicesPage";
    }

    @GetMapping("/edit")
    public String editInvoice(Model model, RedirectAttributes attributes, @RequestParam Long id ){
        String template =  null;
        try{
            Invoice invoice = invoiceService.getInvoice(id);
            model.addAttribute("invoice", invoice);
            template = "editInvoicePage";
        }catch (InvoiceNotFoundException e){
            e.printStackTrace();
            attributes.addAttribute("message",  e.getMessage());
            template = "redirect:getAllInvoices";
        }

        return  template;
    }

    @PostMapping("/update")
    public String updateInvoice(@ModelAttribute Invoice invoice, RedirectAttributes attributes){
        invoiceService.updateInvoice(invoice);
        Long id = invoice.getId();
        String message = "Record with id : '"+ id + "' is updated successfully !";
        attributes.addAttribute("message", message);
        return "redirect:getAllInvoices";
    }

    @GetMapping("/delete")
    public String deleteInvoice(@RequestParam Long id, RedirectAttributes attributes){
        try{
            invoiceService.deleteInvoice(id);
            attributes.addAttribute("message", "Record with id : '"+ id + "' is deleted successfully !");
        }catch (InvoiceNotFoundException e){
            e.printStackTrace();
            attributes.addAttribute("message", e.getMessage());
        }

        return "redirect:getAllInvoices";
    }
}
