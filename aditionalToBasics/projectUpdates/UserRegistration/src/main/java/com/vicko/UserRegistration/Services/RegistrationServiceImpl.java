package com.vicko.UserRegistration.Services;

import com.vicko.UserRegistration.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class RegistrationServiceImpl implements RegistrationService{

    List<User> DB = new ArrayList<>();



    @Override
    public int InsertUser(UUID id, User user) {
        if(DB.stream().anyMatch(u -> u.getUsername().equals(user.getUsername()))){
            System.out.println("User alredy exists");
            return 0;
        }else{
            DB.add(new User(id, user.getUsername(),user.getName(), user.getLastName(), user.getAddress(), user.getZipCode(), user.getCity(), user.getState(), user.getCountry()));
            return 1;
        }



    }

    @Override
    public List<User> getUsers() {
        return DB;
    }
}
