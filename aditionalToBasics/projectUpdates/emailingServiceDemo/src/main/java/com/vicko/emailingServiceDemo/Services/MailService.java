package com.vicko.emailingServiceDemo.Services;

import com.vicko.emailingServiceDemo.Models.Mail;
import com.vicko.emailingServiceDemo.Models.MailUser;
import com.vicko.emailingServiceDemo.Repositories.MailRepository;
import com.vicko.emailingServiceDemo.Repositories.MailUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MailService {

    @Autowired
    private MailUserRepository mailUserRepository;

    @Autowired
    private MailRepository mailRepository;

    public String saveMailUser(MailUser mailUser){
        if(mailUserRepository.findAll().stream().anyMatch(u -> u.getName().equals(mailUser.getName()))){
            return "User already exits";
        }else{
            mailUserRepository.save(mailUser);
            return "User saved";
        }
    }

    public List<Mail> getMails(){
        return mailRepository.findAll();
    }

    public List<MailUser> getUsers() {
        return mailUserRepository.findAll();
    }

    public String sendMail(Mail mail, String username){


        Optional<MailUser> user = mailUserRepository.findAll().stream()
                .filter(u -> u.getName().equals(username))
                .findFirst();

        if(user.isEmpty()){
            return "Operation complete - User Not Found";
        }else{
            boolean isMailRepeated = user.get().getMails().stream()
                    .anyMatch(m -> ((m.getSubject().equals(mail.getSubject())) && (m.getBody().equals(mail.getBody())) && (m.getAttachments().equals(mail.getAttachments()))));

            if(isMailRepeated){
                return "Operation complete - This mail already exits in the receiver mailbox";
            }else{
                mail.userToSend(user.get());
                mailRepository.save(mail);
                return "Operation complete - Mail sent";
            }
        }

    }
}
