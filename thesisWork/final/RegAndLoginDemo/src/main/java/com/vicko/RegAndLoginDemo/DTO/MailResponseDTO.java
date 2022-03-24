package com.vicko.RegAndLoginDemo.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class MailResponseDTO {
    private String sender;
    private String primaryRecipient;
    private String carbonCopy;
    private String blindCarbonCopy;
    private String subject;
    private String body;
    private String attachments;
    private String label;
}
