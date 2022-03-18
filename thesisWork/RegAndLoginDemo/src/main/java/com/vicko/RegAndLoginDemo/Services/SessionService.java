package com.vicko.RegAndLoginDemo.Services;

import org.springframework.stereotype.Service;

import java.security.Principal;

@Service
public class SessionService {

    public String sessionLog(Principal principal){
        return principal.getName();
    }
}
