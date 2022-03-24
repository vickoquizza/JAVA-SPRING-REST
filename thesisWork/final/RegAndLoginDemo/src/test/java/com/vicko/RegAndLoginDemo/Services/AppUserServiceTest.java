package com.vicko.RegAndLoginDemo.Services;

import com.vicko.RegAndLoginDemo.Exceptions.EmailAlreadyExistsException;
import com.vicko.RegAndLoginDemo.Model.AppUser;
import com.vicko.RegAndLoginDemo.Model.AppUserRole;
import com.vicko.RegAndLoginDemo.Repositories.AppUserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class AppUserServiceTest {

    @Mock
    private AppUserRepository repository;

    @Mock
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @InjectMocks
    private AppUserService service;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void CheckIfTheUserAlreadyExists(){
        AppUser appUser = new AppUser("Mario",
                "Mario",
                "1234567890",
                "Mushroom Castle",
                "123456",
                "1-1 map",
                "First world",
                "Musrom Kingdom",
                "mario@Mario.com",
                "password",
                AppUserRole.USER);

        Mockito.when(repository.findByEmail(appUser.getEmail())).thenReturn(Optional.of(appUser));

        assertThrows(EmailAlreadyExistsException.class, () -> service.signUpUser(appUser));
    }

    @Test
    public void CheckIfIsReturningWell(){
        AppUser appUser = new AppUser("Mario",
                "Mario",
                "1234567890",
                "Mushroom Castle",
                "123456",
                "1-1 map",
                "First world",
                "Musrom Kingdom",
                "mario@Mario.com",
                "password",
                AppUserRole.USER);

        AppUser appUser1 = new AppUser("Luigi",
                "Luigi",
                "1234567890",
                "Mushroom Castle",
                "123456",
                "1-1 map",
                "First world",
                "Mushrom Kingdom",
                "luigi@Mario.com",
                "password",
                AppUserRole.USER);

        Mockito.when(repository.findByEmail(appUser1.getEmail())).thenReturn(Optional.of(appUser));
        Mockito.when(bCryptPasswordEncoder.encode(appUser.getPassword())).thenReturn("Encrypted password");

        Mockito.when(repository.save(appUser)).thenReturn(appUser);

        String result = service.signUpUser(appUser);

        assertEquals("USER REGISTERED", result);
    }

}