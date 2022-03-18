package com.vicko.RegAndLoginDemo.Controllers;

import com.vicko.RegAndLoginDemo.Services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(path = "email/session")
@AllArgsConstructor
public class SessionController {

    private SessionService sessionService;

    @GetMapping
    public String sessionLog(Principal principal){
        return sessionService.sessionLog(principal);
    }

    @GetMapping("/inbox")
    public String inbox(){
        return "Si hay acceso con el log";
    }
}
