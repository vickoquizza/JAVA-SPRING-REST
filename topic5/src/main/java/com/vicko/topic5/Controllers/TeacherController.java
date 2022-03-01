package com.vicko.topic5.Controllers;

import com.vicko.topic5.Models.Teacher;
import com.vicko.topic5.Repositories.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    @PostMapping
    public void saveTeacher(@RequestBody Teacher teacher){
        teacherRepository.save(teacher);
    }
}
