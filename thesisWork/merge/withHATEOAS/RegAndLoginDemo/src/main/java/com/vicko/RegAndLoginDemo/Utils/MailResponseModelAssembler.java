package com.vicko.RegAndLoginDemo.Utils;

import com.vicko.RegAndLoginDemo.Controllers.SessionController;
import com.vicko.RegAndLoginDemo.DTO.MailResponseDTO;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import java.security.Principal;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class MailResponseModelAssembler implements RepresentationModelAssembler<MailResponseDTO, EntityModel<MailResponseDTO>> {

    private Principal principal;
    @Override
    public EntityModel<MailResponseDTO> toModel(MailResponseDTO entity) {
        return EntityModel.of(entity, linkTo(methodOn(SessionController.class).sent(principal)).withSelfRel());
    }
}
