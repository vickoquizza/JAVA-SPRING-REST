package com.vicko.emailingServiceDemo.Services;

import com.vicko.emailingServiceDemo.DTO.MailDTO;
import com.vicko.emailingServiceDemo.DTO.MailResponseDTO;
import com.vicko.emailingServiceDemo.Exceptions.PrimaryRecipientNeededException;
import com.vicko.emailingServiceDemo.Models.Mail;
import com.vicko.emailingServiceDemo.Models.MailUser;
import com.vicko.emailingServiceDemo.Repositories.MailRepository;
import com.vicko.emailingServiceDemo.Repositories.MailUserRepository;
import com.vicko.emailingServiceDemo.Utils.MailLabel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.*;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;
import static org.junit.jupiter.api.Assertions.*;

class MailServiceTest {

    @Mock
    private MailRepository mailRepository;

    @Mock
    private MailUserRepository mailUserRepository;

    @InjectMocks
    private MailService service;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void CheckIfSentWorks(){

        Mockito.when(mailRepository.findAll()).thenReturn(mails);

        List<MailResponseDTO> result = service.getSentMails("Mario@Mario.com");

        assertEquals(expected, result);

    }

    @Test
    public void CheckIfInboxWorks() {
        List<MailUser> users = userList();

        Mockito.when(mailUserRepository.findAll()).thenReturn(users);

        Set<Mail> expectedSet = new HashSet<Mail>() {{
            add(new Mail("Luigi@Mario.com",
                    "Mario@Mario.com",
                    null,
                    null,
                    "Hola pana",
                    "¿Bien y vos?",
                    null,
                    false,
                    null));
        }};

        List<Mail> expectedList = new ArrayList<>(expectedSet);

        Set<Mail> result = service.getInbox("Mario@Mario.com");

        List<Mail> resultList = new ArrayList<>(result);

        assertEquals(expectedList.get(0).getSender(), resultList.get(0).getSender());
    }



    @Test
    public void CheckIfPrimaryRecipientExceptionIsWorking(){
        MailDTO DTO = new MailDTO("Mario@Mario.com",
                null,
                null,
                null,
                "Hola pana",
                "¿Como vas?",
                null,
                null);

        assertThrows(PrimaryRecipientNeededException.class, () -> service.sendMail(DTO));
    }

    @Test
    public void CheckIfIsSending(){
        MailDTO DTO = new MailDTO("Mario@Mario.com",
                "Luigi@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Que has hecho?",
                null,
                null);

        Mail response = new Mail("Mario@Mario.com",
                "Luigi@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Que has hecho?",
                null,
                false,
                null);

        Mockito.when(mailUserRepository.findAll()).thenReturn(userList());
        Mockito.when(mailRepository.save(response)).thenReturn(response);

        String result = service.sendMail(DTO);
        assertEquals("Operation complete - Mail sent", result);

    }

    public static List<MailUser> userList(){
        List<MailUser> users = new ArrayList<>();

        MailUser userA = new MailUser("Mario@Mario.com");
        userA.getMails().add(new Mail("Luigi@Mario.com",
                "Mario@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Bien y vos?",
                null,
                false,
                null));
        users.add(userA);
        MailUser userB = new MailUser("Luigi@Mario.com");
        userB.getMails().add(new Mail("Mario@Mario.com",
                "Luigi@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Como vas?",
                null,
                false,
                null));
        users.add(userB);

        return users;
    }

    static List<Mail> mails = new ArrayList<Mail>(){{
        add(new Mail("Mario@Mario.com",
                "Luigi@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Como vas?",
                null,
        false,
                null));
        add(new Mail("Luigi@Mario.com",
                "Bien@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Bien y vos?",
                null,
                false,
                null));
    }};

    static List<MailDTO> expected  = new ArrayList<MailDTO>(){{
        add(new MailDTO("Mario@Mario.com",
                "Luigi@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Como vas?",
                null,
                null));
    }};
}