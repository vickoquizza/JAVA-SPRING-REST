package com.vicko.topic5.Repositories;

import com.vicko.topic5.Models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
