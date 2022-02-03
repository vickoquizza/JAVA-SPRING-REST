package com.vicko.SprinDITest.Services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"dog", "default"})
@Service("pet")
public class DogPetService implements PetService{
    @Override
    public String whichAreTheBestPets() {
        return "Dogs are the best pets!";
    }
}
