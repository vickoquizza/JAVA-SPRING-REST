package com.vicko.RegAndLoginDemo.Controllers;

import com.vicko.RegAndLoginDemo.DTO.MailDTO;
import com.vicko.RegAndLoginDemo.DTO.MailResponseDTO;
import com.vicko.RegAndLoginDemo.Model.Mail;
import com.vicko.RegAndLoginDemo.Services.SessionService;
import com.vicko.RegAndLoginDemo.Utils.MailLabel;
import com.vicko.RegAndLoginDemo.Utils.MailModelAssembler;
import com.vicko.RegAndLoginDemo.Utils.MailResponseModelAssembler;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping(path = "email/session")
@AllArgsConstructor
public class SessionController {

    @Autowired
    private SessionService sessionService;

    @Autowired
    private MailModelAssembler mailModelAssembler;

    @Autowired
    private MailResponseModelAssembler mailResponseModelAssembler;

    @GetMapping({"", "/", "/home"})
    public void home(HttpServletResponse httpResponse) throws IOException {
        httpResponse.sendRedirect("/email/session/inbox");
    }

    @PutMapping("/send")
    public String sendMail(Principal principal,@RequestBody MailDTO mail){
        return sessionService.sendMail(principal, mail);
    }

    @GetMapping("/inbox")
    public CollectionModel<EntityModel<Mail>> inbox(Principal principal){
        Set<EntityModel<Mail>> entityModels = sessionService.getInbox(principal).stream()
                .map(mailModelAssembler::toModel)
                .collect(Collectors.toSet());

        return CollectionModel.of(entityModels, linkTo(methodOn(SessionController.class).inbox(principal)).withRel("mails"));
    }


    @GetMapping("/sent")
    public CollectionModel<EntityModel<MailResponseDTO>> sent(Principal principal){
        List<EntityModel<MailResponseDTO>> entityModels = sessionService.getSentMails(principal).stream()
                .map(mailResponseModelAssembler::toModel)
                .toList();

        return CollectionModel.of(entityModels, linkTo(methodOn(SessionController.class).sent(principal)).withRel("sent_mails"));
    }

    @GetMapping("/search")
    public CollectionModel<EntityModel<Mail>> searchByLabel(Principal principal, @RequestParam(defaultValue = "NORMAL") MailLabel label){
        Set<EntityModel<Mail>> entityModels = sessionService.searchMailByLabel(principal, label).stream()
                .map(mailModelAssembler::toModel)
                .collect(Collectors.toSet());

        return CollectionModel.of(entityModels, linkTo(methodOn(SessionController.class).searchByLabel(principal,label)).withRel("found_mails"));
    }
}
