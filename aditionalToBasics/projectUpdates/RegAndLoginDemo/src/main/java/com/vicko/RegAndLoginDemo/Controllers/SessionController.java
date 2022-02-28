package com.vicko.RegAndLoginDemo.Controllers;

import com.vicko.RegAndLoginDemo.Services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/session")
@AllArgsConstructor
public class SessionController {

    private SessionService sessionService;

    @GetMapping
    public String sessionLog(){
        return sessionService.sessionLog();
    }
}
