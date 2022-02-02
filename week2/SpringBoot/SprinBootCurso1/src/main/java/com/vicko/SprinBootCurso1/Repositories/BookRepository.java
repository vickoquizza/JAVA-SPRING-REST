package com.vicko.SprinBootCurso1.Repositories;

import com.vicko.SprinBootCurso1.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
