package com.vicko.topic5.Repositories;

import com.vicko.topic5.Models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
