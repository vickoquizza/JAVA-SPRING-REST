package com.vicko.emailingServiceDemo.Controllers;


import com.vicko.emailingServiceDemo.DTO.MailDTO;
import com.vicko.emailingServiceDemo.DTO.MailResponseDTO;
import com.vicko.emailingServiceDemo.Exceptions.PrimaryRecipientNeededException;
import com.vicko.emailingServiceDemo.Models.Mail;
import com.vicko.emailingServiceDemo.Models.MailUser;
import com.vicko.emailingServiceDemo.Services.MailService;
import com.vicko.emailingServiceDemo.Utils.MailLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/email")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping
    public String createUser(@RequestBody MailUser mailUser){
        return mailService.saveMailUser(mailUser);
    }

    @PutMapping("/send")
    public String sendMails(@RequestBody MailDTO mail){

        return mailService.sendMail(mail);
    }

    @GetMapping("/mails/sent/{sender}")
    public List<MailResponseDTO> getSentMails(@PathVariable String sender){
        return mailService.getSentMails(sender);

    }

    @GetMapping("/mails/search/{recipient}")
    public Set<Mail> searchByLabel(@PathVariable String recipient, @RequestParam MailLabel label){
        return mailService.searchMailByLabel(recipient,label);
    }

    @GetMapping("/mails/inbox/{recipient}")
    public Set<Mail> getInbox(@PathVariable String recipient){
        return mailService.getInbox(recipient);

    }

    @GetMapping("/users")
    public List<MailUser> getUsers(){
        return mailService.getUsers();
    }
}
