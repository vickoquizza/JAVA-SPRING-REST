package com.vicko.emailingServiceDemo.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
    @Column(nullable = true)
    private String carbonCopy;
    @JsonIgnore
    private String blindCarbonCopy;
    private boolean sentByBcc;
    private String subject;
    @Column(nullable = true)
    private String body;
    @Column(nullable = true)
    private String attachments;

    public Mail(){

    }

    public Mail(String sender,
                String primaryRecipient,
                String carbonCopy,
                String blindCarbonCopy,
                String subject,
                String body,
                String attachments,
                boolean sentByBcc) {
        this.sender = sender;
        this.primaryRecipient = primaryRecipient;
        this.carbonCopy = carbonCopy;
        this.blindCarbonCopy = blindCarbonCopy;
        this.subject = subject;
        this.body = body;
        this.attachments = attachments;
        this.sentByBcc = sentByBcc;
    }

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "mail_users",joinColumns = @JoinColumn(name = "mail_id"), inverseJoinColumns = @JoinColumn(name = "mailUser_id"))
    Set<MailUser> mailUser = new HashSet<>();

}
