package com.vicko.emailingServiceDemo.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(nullable = true)
    private String blindCarbonCopy;
    private String subject;
    @Column(nullable = true)
    private String body;
    @Column(nullable = true)
    private String attachments;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "mail_users",joinColumns = @JoinColumn(name = "mail_id"), inverseJoinColumns = @JoinColumn(name = "mailUser_id"))
    Set<MailUser> mailUser = new HashSet<>();

}
