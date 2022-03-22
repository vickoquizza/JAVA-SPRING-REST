package com.vicko.RegAndLoginDemo.Controllers;

import com.vicko.RegAndLoginDemo.DTO.MailDTO;
import com.vicko.RegAndLoginDemo.DTO.MailResponseDTO;
import com.vicko.RegAndLoginDemo.Model.Mail;
import com.vicko.RegAndLoginDemo.Services.SessionService;
import com.vicko.RegAndLoginDemo.Utils.MailLabel;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "email/session")
@AllArgsConstructor
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @PutMapping("/send")
    public String sendMail(Principal principal,@RequestBody MailDTO mail){
        return sessionService.sendMail(principal, mail);
    }

    @GetMapping("/inbox")
    public Set<Mail> inbox(Principal principal){
        return sessionService.getInbox(principal);
    }


    @GetMapping("/sent")
    public List<MailResponseDTO> sent(Principal principal){
        return sessionService.getSentMails(principal);
    }

    @GetMapping("/search")
    public Set<Mail> searchByLabel(Principal principal, @RequestParam MailLabel label){
        return sessionService.searchMailByLabel(principal, label);
    }
}
