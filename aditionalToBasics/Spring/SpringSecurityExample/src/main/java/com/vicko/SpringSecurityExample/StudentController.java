package com.vicko.SpringSecurityExample;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    List<Student> STUDENTS = new ArrayList<>();

    @PostMapping("students/register")
    public void saveStudent(@RequestBody Student student){
        STUDENTS.add(student);
    }

    @GetMapping("students/{id}")
    public Student getStudent(@PathVariable("id") Integer id){
        return STUDENTS.stream()
                .filter(student -> id.equals(student.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("User No. " + id + "doesn't exists"));
    }

}
