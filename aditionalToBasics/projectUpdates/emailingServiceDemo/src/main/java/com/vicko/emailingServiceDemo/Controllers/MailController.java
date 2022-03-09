package com.vicko.emailingServiceDemo.Controllers;


import com.vicko.emailingServiceDemo.Models.Mail;
import com.vicko.emailingServiceDemo.Models.MailUser;
import com.vicko.emailingServiceDemo.Services.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/email")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping
    public String createUser(@RequestBody MailUser mailUser){
        return mailService.saveMailUser(mailUser);
    }

    @PutMapping("/{MailUserName}")
    public String sendMails(@RequestBody Mail mail, @PathVariable String MailUserName){
        return mailService.sendMail(mail, MailUserName);
    }

    @GetMapping("/mails")
    public List<Mail> getMails(){
        return mailService.getMails();

    }

    @GetMapping("/users")
    public List<MailUser> getUsers(){
        return mailService.getUsers();
    }
}
