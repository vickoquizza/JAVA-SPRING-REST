package com.vicko.RegAndLoginDemo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vicko.RegAndLoginDemo.Utils.MailLabel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MailLabel> label = new ArrayList<MailLabel>();

    public Mail(){

    }

    public Mail(String sender,
                String primaryRecipient,
                String carbonCopy,
                String blindCarbonCopy,
                String subject,
                String body,
                String attachments,
                boolean sentByBcc,
                List<MailLabel> label) {
        this.sender = sender;
        this.primaryRecipient = primaryRecipient;
        this.carbonCopy = carbonCopy;
        this.blindCarbonCopy = blindCarbonCopy;
        this.subject = subject;
        this.body = body;
        this.attachments = attachments;
        this.sentByBcc = sentByBcc;
        this.label = label;
    }

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "mail_users",joinColumns = @JoinColumn(name = "mail_id"), inverseJoinColumns = @JoinColumn(name = "appUser_id"))
    Set<AppUser> mailUsers = new HashSet<>();
}
