package com.vicko.SprinBootCurso1.Repositories;

import com.vicko.SprinBootCurso1.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
