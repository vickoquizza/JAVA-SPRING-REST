package com.vicko.SprinDITest.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service("pet")
public class CatPetService implements PetService{
    @Override
    public String whichAreTheBestPets() {
        return "Cats are the best pets!";
    }
}
