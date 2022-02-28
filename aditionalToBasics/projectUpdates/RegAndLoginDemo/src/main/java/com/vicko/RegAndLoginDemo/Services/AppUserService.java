package com.vicko.RegAndLoginDemo.Services;

import com.vicko.RegAndLoginDemo.Model.AppUser;
import com.vicko.RegAndLoginDemo.Repositories.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AppUserService implements UserDetailsService {

    private final AppUserRepository repository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email).orElseThrow(() -> new UsernameNotFoundException(String.format("Email  %s not founded", email)));
    }

    public String signUpUser(AppUser appUser){
        boolean userExists = repository.findByEmail(appUser.getEmail()).isPresent();

        if(userExists){
            throw new IllegalStateException("User alredy exits");
        }

        String encryptedPassword = bCryptPasswordEncoder.encode(appUser.getPassword());

        appUser.setPassword(encryptedPassword);

        repository.save(appUser);
        return "it works";
    }
}
