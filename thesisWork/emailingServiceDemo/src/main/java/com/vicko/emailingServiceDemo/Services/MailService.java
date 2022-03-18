package com.vicko.emailingServiceDemo.Services;

import com.vicko.emailingServiceDemo.DTO.MailDTO;
import com.vicko.emailingServiceDemo.Exceptions.PrimaryRecipientNeededException;
import com.vicko.emailingServiceDemo.Models.Mail;
import com.vicko.emailingServiceDemo.Models.MailUser;
import com.vicko.emailingServiceDemo.Repositories.MailRepository;
import com.vicko.emailingServiceDemo.Repositories.MailUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


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

    public List<MailDTO> getSentMails(String sender){
        List<MailDTO> mails = mailRepository.findAll().stream().
                map(mail -> new MailDTO(
                        mail.getSender(),
                        mail.getPrimaryRecipient(),
                        mail.getCarbonCopy(),
                        mail.getBlindCarbonCopy(),
                        mail.getSubject(),
                        mail.getBody(),
                        mail.getAttachments()
                )).distinct()
                .toList();

        return mails;
    }

    public Set<Mail> getInbox(String recipient){
        return  mailUserRepository.findAll().stream()
                .filter(user -> user.getName().equals(recipient))
                .findFirst()
                .get()
                .getMails();
    }

     public List<MailUser> getUsers() {
        return mailUserRepository.findAll();
    }

    public String sendMail(MailDTO mail){
        if(mail.getPrimaryRecipient() == null){
            throw new PrimaryRecipientNeededException();
        }

        String[] recipients = (mail.getPrimaryRecipient() + "," +  mail.getCarbonCopy() +  "," + mail.getBlindCarbonCopy()).split(",");

        List<String> username = Arrays.asList(recipients);

        List<MailUser> users = mailUserRepository.findAll().stream()
                .filter(u -> username.stream()
                        .anyMatch(name -> name.equals(u.getName())))
                .toList();

        List<String> blindCarbonCopyNames = Arrays.asList(mail.getBlindCarbonCopy().split(","));

        List<MailUser> BlindCarbonCopyUsers = mailUserRepository.findAll().stream()
                .filter(u -> blindCarbonCopyNames.stream()
                        .anyMatch(name -> name.equals(u.getName())))
                .toList();



        String statement = "";
        for(MailUser user: users){
                boolean isMailRepeated = user.getMails().stream()
                        .anyMatch(m -> ((m.getSubject().equals(mail.getSubject())) && (m.getBody().equals(mail.getBody())) && (m.getAttachments().equals(mail.getAttachments()))));

                if(isMailRepeated){
                    statement =  "Operation complete - This mail already exits in the receiver mailbox";
                }else{
                    Mail toSend;
                    if(BlindCarbonCopyUsers.contains(user)){
                        toSend = new Mail(mail.getSender(),
                                mail.getPrimaryRecipient(),
                                mail.getCarbonCopy(),
                                mail.getBlindCarbonCopy(),
                                mail.getSubject(),
                                mail.getBody(),
                                mail.getAttachments(),
                                true);
                    }else{
                        toSend = new Mail(mail.getSender(),
                                mail.getPrimaryRecipient(),
                                mail.getCarbonCopy(),
                                mail.getBlindCarbonCopy(),
                                mail.getSubject(),
                                mail.getBody(),
                                mail.getAttachments(),
                                false);
                    }

                    toSend.getMailUser().add(user);
                    mailRepository.save(toSend);
                    statement = "Operation complete - Mail sent";
                }
            }

        return statement;
        }

}
