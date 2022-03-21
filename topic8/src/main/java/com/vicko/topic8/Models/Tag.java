package com.vicko.topic8.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tag {

    @Id
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "tags")
    private Set<Book> books = new HashSet<>();
}
