package com.vicko.RegAndLoginDemo.Services;

import com.vicko.RegAndLoginDemo.DTO.MailDTO;
import com.vicko.RegAndLoginDemo.DTO.MailResponseDTO;
import com.vicko.RegAndLoginDemo.Exceptions.PrimaryRecipientNeededException;
import com.vicko.RegAndLoginDemo.Model.AppUser;
import com.vicko.RegAndLoginDemo.Model.AppUserRole;
import com.vicko.RegAndLoginDemo.Model.Mail;
import com.vicko.RegAndLoginDemo.Repositories.AppUserRepository;
import com.vicko.RegAndLoginDemo.Repositories.MailRepository;
import com.vicko.RegAndLoginDemo.Utils.MailLabel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SessionServiceTest {

    @Mock
    private Principal principal;

    @Mock
    private MailRepository mailRepository;

    @Mock
    private AppUserRepository mailUserRepository;

    @InjectMocks
    private SessionService service;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void CheckIfSentWorks(){

        Mockito.when(mailRepository.findAll()).thenReturn(mails);

        Mockito.when(principal.getName()).thenReturn("Mario@Mario.com");

        List<MailResponseDTO> result = service.getSentMails(principal);

        assertEquals(expected, result);

    }

    @Test
    public void CheckIfInboxWorks() {
        List<AppUser> users = userList();

        Mockito.when(mailUserRepository.findAll()).thenReturn(users);
        Mockito.when(principal.getName()).thenReturn("Mario@Mario.com");

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

        Set<Mail> result = service.getInbox(principal);

        List<Mail> resultList = new ArrayList<>(result);

        assertEquals(expectedList.get(0).getSender(), resultList.get(0).getSender());
    }

    @Test
    public void CheckIfSearchWorks(){
        List<AppUser> users = userList();

        Mockito.when(mailUserRepository.findAll()).thenReturn(users);
        Mockito.when(principal.getName()).thenReturn("Mario@Mario.com");

        Set<Mail> expectedSet = new HashSet<Mail>() {{
            add(new Mail("Luigi@Mario.com",
                    "Mario@Mario.com",
                    null,
                    null,
                    "Hola pana",
                    "¿Bien y vos?",
                    null,
                    false,
                    new ArrayList<MailLabel>(){{
                        add(MailLabel.BUSINESS);
                        add(MailLabel.IMPORTANT);
                    }}));
        }};

        List<Mail> expectedList = new ArrayList<>(expectedSet);

        Set<Mail> result = service.searchMailByLabel(principal, MailLabel.BUSINESS);

        List<Mail> resultList = new ArrayList<>(result);

        assertEquals(expectedList.get(0).getSender(), resultList.get(0).getSender());

    }



    @Test
    public void CheckIfPrimaryRecipientExceptionIsWorking(){
        Mockito.when(principal.getName()).thenReturn("Mario@Mario.com");

        MailDTO DTO = new MailDTO(null,
                null,
                null,
                null,
                "Hola pana",
                "¿Como vas?",
                null);

        assertThrows(PrimaryRecipientNeededException.class, () -> service.sendMail(principal, DTO));
    }

    @Test
    public void CheckIfIsSending(){

        Mockito.when(principal.getName()).thenReturn("Mario@Mario.com");

        MailDTO DTO = new MailDTO("Luigi@Mario.com",
                null,
                null,
                null,
                "Hola pana",
                "¿Que has hecho?",
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

        String result = service.sendMail(principal, DTO);
        assertEquals("Operation complete - Mail sent", result);

    }

    public static List<AppUser> userList(){
        List<AppUser> users = new ArrayList<>();

        AppUser userA = new AppUser("Mario",
                "Mario",
                "1113793792",
                "Peach Castle",
                "009876",
                "Stage 1-1",
                "World 1",
                "Mushroom Kingdom",
                "Mario@Mario.com",
                "password",
                AppUserRole.USER);
        userA.getMails().add(new Mail("Luigi@Mario.com",
                "Mario@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Bien y vos?",
                null,
                false,
                new ArrayList<>(){{
                    add(MailLabel.IMPORTANT);
                }}));
        userA.getMails().add(new Mail("Luigi@Mario.com",
                "Mario@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Bien y vos?",
                null,
                false,
                new ArrayList<>(){{
                    add(MailLabel.BUSINESS);
                }}));
        users.add(userA);
        AppUser userB = new AppUser("Luigi",
                "Mario",
                "1113793792",
                "Peach Castle",
                "009876",
                "Stage 1-1",
                "World 1",
                "Mushroom Kingdom",
                "Luigi@Mario.com",
                "password",
                AppUserRole.USER);
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
                new ArrayList<>(){{
                    add(MailLabel.BUSINESS);
                    add(MailLabel.IMPORTANT);
                }}));
        add(new Mail("Luigi@Mario.com",
                "Bien@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Bien y vos?",
                null,
                false,
                new ArrayList<>(){{
                    add(MailLabel.BUSINESS);
                    add(MailLabel.IMPORTANT);
                }}));
    }};

    static List<MailResponseDTO> expected  = new ArrayList<MailResponseDTO>(){{
        add(new MailResponseDTO("Mario@Mario.com",
                "Luigi@Mario.com",
                null,
                null,
                "Hola pana",
                "¿Como vas?",
                null,
                "[BUSINESS, IMPORTANT]"));
    }};

}