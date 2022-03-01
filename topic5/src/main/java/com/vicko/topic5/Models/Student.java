package com.vicko.topic5.Models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private String studentClass;

    @JsonIgnore
    @ManyToMany(mappedBy = "enrolledStudents")
    private Set<Subject> subjectsEnrolled = new HashSet<>();

}
