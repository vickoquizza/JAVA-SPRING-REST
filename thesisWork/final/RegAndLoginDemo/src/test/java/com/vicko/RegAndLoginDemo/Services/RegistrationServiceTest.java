package com.vicko.RegAndLoginDemo.Services;

import com.vicko.RegAndLoginDemo.Exceptions.IlegalEmailException;
import com.vicko.RegAndLoginDemo.Model.AppUser;
import com.vicko.RegAndLoginDemo.Model.AppUserRole;
import com.vicko.RegAndLoginDemo.Model.RegistrationRequest;
import com.vicko.RegAndLoginDemo.Utils.EmailValidator;
import com.vicko.RegAndLoginDemo.Utils.IdentificationNumberValidator;
import com.vicko.RegAndLoginDemo.Utils.zipCodeValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationServiceTest {

    @Mock
    private AppUserService appUserService;

    @Mock
    private EmailValidator emailValidator;

    @Mock
    private IdentificationNumberValidator numberValidator;

    @Mock
    private zipCodeValidator zipCodeValidator;

    @InjectMocks
    private RegistrationService registrationService;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void CheckEmailException(){
        RegistrationRequest request = new RegistrationRequest("Mario",
                "Mario",
                "1113793793",
                "Mushroom Castle",
                "123456",
                "Cali",
                "Valle del Cauca",
                "Colombia",
                "mario@.com",
                "password");

        Mockito.when(emailValidator.test(request.getEmail())).thenReturn(false);
        Mockito.when(numberValidator.test(request.getIdentificationNumber())).thenReturn(true);
        Mockito.when(zipCodeValidator.test(request.getZipCode())).thenReturn(true);

        assertThrows(IlegalEmailException.class, () -> registrationService.register(request));
    }


    @Test
    public void CheckZipCodeException(){
        RegistrationRequest request = new RegistrationRequest("Mario",
                "Mario",
                "1113793793",
                "Mushroom Castle",
                "13456",
                "Cali",
                "Valle del Cauca",
                "Colombia",
                "mario@mario.com",
                "password");

        Mockito.when(emailValidator.test(request.getEmail())).thenReturn(true);
        Mockito.when(numberValidator.test(request.getIdentificationNumber())).thenReturn(true);
        Mockito.when(zipCodeValidator.test(request.getZipCode())).thenReturn(false);

        IllegalStateException ex = assertThrows(IllegalStateException.class, () -> registrationService.register(request));

        assertEquals("ERROR: Try again, Zip code isn't valid", ex.getMessage());

    }


    @Test
    public void CheckIdNumberException(){
        RegistrationRequest request = new RegistrationRequest("Mario",
                "Mario",
                "1113793793",
                "Mushroom Castle",
                "13456",
                "Cali",
                "Valle del Cauca",
                "Colombia",
                "mario@mario.com",
                "password");

        Mockito.when(emailValidator.test(request.getEmail())).thenReturn(true);
        Mockito.when(numberValidator.test(request.getIdentificationNumber())).thenReturn(false);
        Mockito.when(zipCodeValidator.test(request.getZipCode())).thenReturn(true);

        IllegalStateException ex = assertThrows(IllegalStateException.class, () -> registrationService.register(request));

        assertEquals("ERROR: Try again, Identification number isn't valid", ex.getMessage());

    }

    @Test
    public void CheckIfDTOisSent(){
        RegistrationRequest request = new RegistrationRequest("Mario",
                "Mario",
                "1113793793",
                "Mushroom Castle",
                "13456",
                "Cali",
                "Valle del Cauca",
                "Colombia",
                "mario@mario.com",
                "password");

        Mockito.when(emailValidator.test(request.getEmail())).thenReturn(true);
        Mockito.when(numberValidator.test(request.getIdentificationNumber())).thenReturn(true);
        Mockito.when(zipCodeValidator.test(request.getZipCode())).thenReturn(true);


        Mockito.when(appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getIdentificationNumber(),
                        request.getAddress(),
                        request.getZipCode(),
                        request.getCity(),
                        request.getState(),
                        request.getCountry(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                ))).thenReturn("USER REGISTERED");

        String result = registrationService.register(request);

        assertEquals("USER REGISTERED", result);
    }


}