package com.vicko.topic8.Repositories;

import com.vicko.topic8.Models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
