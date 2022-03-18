package com.vicko.RegAndLoginDemo.Services;

import com.vicko.RegAndLoginDemo.Exceptions.IlegalEmailException;
import com.vicko.RegAndLoginDemo.Model.AppUser;
import com.vicko.RegAndLoginDemo.Model.AppUserRole;
import com.vicko.RegAndLoginDemo.Model.RegistrationRequest;
import com.vicko.RegAndLoginDemo.Utils.EmailValidator;
import com.vicko.RegAndLoginDemo.Utils.IdentificationNumberValidator;
import com.vicko.RegAndLoginDemo.Utils.zipCodeValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {


    private final AppUserService appUserService;
    private final EmailValidator emailValidator;
    private final zipCodeValidator zipCodeValidator;
    private final IdentificationNumberValidator identificationNumberValidator;


    public String register(RegistrationRequest request) {
        boolean isEmailValid = emailValidator.test(request.getEmail());
        boolean isZipCodeValid = zipCodeValidator.test(request.getZipCode());
        boolean isIdNumValid = identificationNumberValidator.test(request.getIdentificationNumber());

        if(!isIdNumValid){
            throw new IllegalStateException("ERROR: Try again, Identification number isn't valid");
        }

        if(!isZipCodeValid){
            throw new IllegalStateException("ERROR: Try again, Zip code isn't valid");
        }

        if(!isEmailValid){
            throw new IlegalEmailException();
        }

        return appUserService.signUpUser(
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
                )
        );
    }
}
