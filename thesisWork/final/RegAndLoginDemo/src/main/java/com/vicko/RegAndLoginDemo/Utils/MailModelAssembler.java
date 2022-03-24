package com.vicko.RegAndLoginDemo.Utils;

import com.vicko.RegAndLoginDemo.Controllers.SessionController;
import com.vicko.RegAndLoginDemo.Model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;


import java.security.Principal;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class MailModelAssembler implements RepresentationModelAssembler<Mail, EntityModel<Mail>> {

    private Principal principal;

    @Override
    public EntityModel<Mail> toModel(Mail entity) {
        return EntityModel.of(entity, linkTo(methodOn(SessionController.class).inbox(principal)).withRel("mails"));
    }
}
