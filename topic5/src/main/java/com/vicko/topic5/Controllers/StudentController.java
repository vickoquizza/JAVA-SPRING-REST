package com.vicko.topic5.Controllers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vicko.topic5.Models.Student;
import com.vicko.topic5.Repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository studentRepository;

    @GetMapping
    public List<Student> getStudents() {return studentRepository.findAll();}

    @PostMapping
    public String saveStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "It Works";
    }
}
