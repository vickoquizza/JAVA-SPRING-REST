package com.vicko.topic8.Models;

import com.vicko.topic8.Utils.Status;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private  Category category;

    private String name;

    @ManyToMany
    @JoinTable(name = "tags", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private Set<Tag> tags = new HashSet<>();

    @Enumerated(EnumType.STRING)
    private Status status;
}
