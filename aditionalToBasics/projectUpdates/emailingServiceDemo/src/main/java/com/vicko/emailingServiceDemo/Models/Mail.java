package com.vicko.emailingServiceDemo.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Mail {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sender;
    private String primaryRecipient;
    private String subject;
    private String body;
    private String attachments;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mailUser_id", referencedColumnName = "id")
    private MailUser mailUser;

    public void userToSend(MailUser user) {
        this.mailUser = user;
    }
}
