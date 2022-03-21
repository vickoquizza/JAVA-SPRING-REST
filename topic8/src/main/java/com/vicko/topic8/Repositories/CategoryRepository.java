package com.vicko.topic8.Repositories;

import com.vicko.topic8.Models.Category;
import com.vicko.topic8.Models.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Tag> {
}
