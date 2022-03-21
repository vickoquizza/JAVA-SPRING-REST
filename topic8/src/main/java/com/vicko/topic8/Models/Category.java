package com.vicko.topic8.Models;


import lombok.*;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {

    @Id
    private Long id;

    private String name;
}
