package com.vicko.RegAndLoginDemo.DTO;

import com.vicko.RegAndLoginDemo.Utils.MailLabel;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class MailDTO {
    private String primaryRecipient;
    private String carbonCopy;
    private String blindCarbonCopy;
    private String subject;
    private String body;
    private String attachments;
    private List<MailLabel> label = new ArrayList<MailLabel>();
}
