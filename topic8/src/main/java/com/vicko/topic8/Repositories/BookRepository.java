package com.vicko.topic8.Repositories;

import com.vicko.topic8.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
