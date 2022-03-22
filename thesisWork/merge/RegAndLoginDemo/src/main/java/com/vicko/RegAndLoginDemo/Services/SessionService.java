package com.vicko.RegAndLoginDemo.Services;

import com.vicko.RegAndLoginDemo.DTO.MailDTO;
import com.vicko.RegAndLoginDemo.Exceptions.BodyNeededException;
import com.vicko.RegAndLoginDemo.Exceptions.PrimaryRecipientNeededException;
import com.vicko.RegAndLoginDemo.Model.AppUser;
import com.vicko.RegAndLoginDemo.Model.Mail;
import com.vicko.RegAndLoginDemo.Repositories.AppUserRepository;
import com.vicko.RegAndLoginDemo.Repositories.MailRepository;
import com.vicko.RegAndLoginDemo.Utils.MailLabel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Service
public class SessionService {

    @Autowired
    private AppUserRepository mailUserRepository;

    @Autowired
    private MailRepository mailRepository;

    public Set<Mail> getInbox(Principal principal){
        return  mailUserRepository.findAll().stream()
                .filter(user -> user.getEmail().equals(principal.getName()))
                .findFirst()
                .get()
                .getMails();
    }

    public String sendMail(Principal principal, MailDTO mail){
        if(mail.getPrimaryRecipient() == null){
            throw new PrimaryRecipientNeededException();
        }

        if (mail.getBody() == null){
            throw new BodyNeededException();
        }

        if(mail.getBlindCarbonCopy() == null){
            mail.setBlindCarbonCopy("");
        }

        if(mail.getLabel() == null){
            mail.setLabel(new ArrayList<>(){{
                add(MailLabel.NORMAL);
            }});
        }

        String[] recipients = (mail.getPrimaryRecipient() + "," +  mail.getCarbonCopy() +  "," + mail.getBlindCarbonCopy()).split(",");

        List<String> username = Arrays.asList(recipients);

        List<AppUser> users = mailUserRepository.findAll().stream()
                .filter(u -> username.stream()
                        .anyMatch(name -> name.equals(u.getEmail())))
                .toList();

        List<String> blindCarbonCopyNames = Arrays.asList(mail.getBlindCarbonCopy().split(","));

        List<AppUser> BlindCarbonCopyUsers = mailUserRepository.findAll().stream()
                .filter(u -> blindCarbonCopyNames.stream()
                        .anyMatch(name -> name.equals(u.getEmail())))
                .toList();



        String statement = "";
        for(AppUser user: users){
            boolean isMailRepeated = user.getMails().stream()
                    .anyMatch(m -> ((m.getSubject().equals(mail.getSubject())) && (m.getBody().equals(mail.getBody()))));

            if(isMailRepeated){
                statement =  "Operation complete - This mail already exits in the receiver mailbox";
            }else{
                Mail toSend;
                if(BlindCarbonCopyUsers.contains(user)){
                    toSend = new Mail(principal.getName(),
                            mail.getPrimaryRecipient(),
                            mail.getCarbonCopy(),
                            mail.getBlindCarbonCopy(),
                            mail.getSubject(),
                            mail.getBody(),
                            mail.getAttachments(),
                            true,
                            mail.getLabel());
                }else{
                    toSend = new Mail(principal.getName(),
                            mail.getPrimaryRecipient(),
                            mail.getCarbonCopy(),
                            mail.getBlindCarbonCopy(),
                            mail.getSubject(),
                            mail.getBody(),
                            mail.getAttachments(),
                            false,
                            mail.getLabel());
                }

                toSend.getMailUsers().add(user);
                mailRepository.save(toSend);
                statement = "Operation complete - Mail sent";
            }
        }

        return statement;
    }
}
