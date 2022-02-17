package com.vicko.UserRegistration.Services;

import com.vicko.UserRegistration.Model.User;

import java.util.List;
import java.util.UUID;

public interface RegistrationService {
    int InsertUser(UUID id, User user);

    default  int InsertUser(User user){
        UUID id = UUID.randomUUID();

        return InsertUser(id, user);
    }

    List<User> getUsers();
}
