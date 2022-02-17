package com.vicko.UserRegistration.Controller;

import com.vicko.UserRegistration.Model.User;
import com.vicko.UserRegistration.Services.RegistrationService;
import com.vicko.UserRegistration.Services.RegistrationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class RegistrationController {

    @Autowired
    private RegistrationServiceImpl register;

    @PostMapping
    public int registerUser(@RequestBody User user){
        return register.InsertUser(user);
    }

    @GetMapping
    public List<User> getUsers(){
        return register.getUsers();
    }
}
