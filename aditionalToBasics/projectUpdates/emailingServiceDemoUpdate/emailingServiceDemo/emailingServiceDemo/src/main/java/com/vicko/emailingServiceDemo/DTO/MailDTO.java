package com.vicko.emailingServiceDemo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.Column;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class MailDTO {
    private String sender;
    private String primaryRecipient;
    private String carbonCopy;
    private String blindCarbonCopy;
    private String subject;
    private String body;
    private String attachments;
}
