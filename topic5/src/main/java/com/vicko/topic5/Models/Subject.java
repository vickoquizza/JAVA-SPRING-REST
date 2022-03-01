package com.vicko.topic5.Models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import com.vicko.topic5.Models.Student;

@Getter
@Setter
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "students_enrolled" , joinColumns = @JoinColumn(name = "subject_id"), inverseJoinColumns = @JoinColumn(name = "student_id"))
    Set<Student> enrolledStudents = new HashSet<>();


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
