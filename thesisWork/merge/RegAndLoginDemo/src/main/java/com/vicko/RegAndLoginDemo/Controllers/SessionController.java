package com.vicko.RegAndLoginDemo.Controllers;

import com.vicko.RegAndLoginDemo.DTO.MailDTO;
import com.vicko.RegAndLoginDemo.Model.Mail;
import com.vicko.RegAndLoginDemo.Services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.Set;

@RestController
@RequestMapping(path = "email/session")
@AllArgsConstructor
public class SessionController {

    private SessionService sessionService;

    @PutMapping("/send")
    public String sendMail(Principal principal,@RequestBody MailDTO mail){
        return sessionService.sendMail(principal, mail);
    }

    @GetMapping("/inbox")
    public Set<Mail> inbox(Principal principal){
        return sessionService.getInbox(principal);
    }


}
