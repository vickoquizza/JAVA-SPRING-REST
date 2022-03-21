package com.vicko.topic8.DTO;

import com.vicko.topic8.Models.Category;
import com.vicko.topic8.Models.Tag;
import com.vicko.topic8.Utils.Status;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class BookDTO {
    private Long id;
    private Category category;
    private String name;
    private Set<Tag> tags;
    private Status status;
}
