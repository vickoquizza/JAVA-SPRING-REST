package com.vicko.topic8.Controller;

import com.vicko.topic8.DTO.BookDTO;
import com.vicko.topic8.DTO.BookFormDTO;
import com.vicko.topic8.Models.Book;
import com.vicko.topic8.Services.BookService;
import com.vicko.topic8.Utils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/books")
    public void saveBook(@RequestBody BookDTO bookDTO){
        bookService.saveBook(bookDTO);
    }

    @PutMapping("/books")
    public void updateBook(@RequestBody BookDTO bookDTO){
        bookService.updateBook(bookDTO);
    }

    @PostMapping("/books/{id}")
    public void updateBookByPost(@PathVariable Long id, @RequestBody BookFormDTO form){
        bookService.updateBookById(id, form);
    }

    @GetMapping("/books/findByStatus")
    public List<Book> findByStatus(@RequestParam Status status){
        return bookService.findByStatus(status);
    }

    @GetMapping("/books/{id}")
    public Book findById(@PathVariable Long id){
        return bookService.findById(id);
    }
}
