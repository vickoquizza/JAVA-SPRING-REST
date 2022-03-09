package com.vicko.HelloWorldMVC.Controller;

import com.vicko.HelloWorldMVC.Models.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PhoneController {

    @GetMapping("/validatePhone")
    public String loadFormPage(Model m){
        m.addAttribute("phone", new Phone());
        return  "phoneHome";
    }

    @PostMapping("/addValidatePhone")
    public String submitFormPage(@Valid Phone p, BindingResult r, Model m){
        if(r.hasErrors()){
            return "phoneHome";
        }
        m.addAttribute("message" , "Successfully saved phone " + p.toString());
        return "phoneHome";
    }
}
