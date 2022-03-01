package com.vicko.topic5.Controllers;


import com.vicko.topic5.Models.Student;
import com.vicko.topic5.Models.Subject;
import com.vicko.topic5.Models.Teacher;
import com.vicko.topic5.Repositories.StudentRepository;
import com.vicko.topic5.Repositories.SubjectRepository;
import com.vicko.topic5.Repositories.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/subjects")
public class SubjectController {

    private final SubjectRepository subjectRepository;
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;

    @GetMapping
    List<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    @PostMapping
    Subject createSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }

    @PutMapping("/{subjectId}/students/{studentId}")
    Subject addStudentToSubject(
            @PathVariable Long subjectId,
            @PathVariable Long studentId
    ) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Student student = studentRepository.findById(studentId).get();
        subject.getEnrolledStudents().add(student);
        return subjectRepository.save(subject);
    }

    @PutMapping("/{subjectId}/teachers/{teacherId}")
    Subject addTeacherToSubject(
            @PathVariable Long subjectId,
            @PathVariable Long teacherId
    ) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Teacher teacher = teacherRepository.findById(teacherId).get();
        subject.assignTeacher(teacher);
        return subjectRepository.save(subject);
    }
}
