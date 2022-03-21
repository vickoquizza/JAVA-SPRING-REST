package com.vicko.topic8.DTO;

import com.vicko.topic8.Utils.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookFormDTO {
    private String name;
    private Status status;
}
