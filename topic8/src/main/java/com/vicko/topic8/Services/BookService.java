package com.vicko.topic8.Services;

import com.vicko.topic8.DTO.BookDTO;
import com.vicko.topic8.DTO.BookFormDTO;
import com.vicko.topic8.Exceptions.BookNotFoundException;
import com.vicko.topic8.Exceptions.InvalidIdException;
import com.vicko.topic8.Models.Book;
import com.vicko.topic8.Repositories.BookRepository;
import com.vicko.topic8.Repositories.CategoryRepository;
import com.vicko.topic8.Repositories.TagRepository;
import com.vicko.topic8.Utils.IdValidator;
import com.vicko.topic8.Utils.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private TagRepository tagRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private IdValidator idValidator;

    public void saveBook(BookDTO book){
        Book bookToSave = new Book(book.getId(),
                book.getCategory(),
                book.getName(),
                book.getTags(),
                book.getStatus());

        categoryRepository.save(bookToSave.getCategory());
        tagRepository.saveAll(bookToSave.getTags());
        bookRepository.save(bookToSave);
    }

    public List<Book> findByStatus(Status status){
        return bookRepository.findAll().stream()
                .filter(book -> book.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public Book findById(Long id){
        return bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
    }

    public void updateBook(BookDTO book){
        bookRepository.findById(book.getId()).orElseThrow(BookNotFoundException::new);

        if(!idValidator.test(book.getId())){
            throw new InvalidIdException();
        }

        Book bookToSave = new Book(book.getId(),
                book.getCategory(),
                book.getName(),
                book.getTags(),
                book.getStatus());


        bookRepository.save(bookToSave);
    }

    public void updateBookById(Long id, BookFormDTO book){
        if(!idValidator.test(id)){
            throw new InvalidIdException();
        }


        Book bookToUpdate =  bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
        bookToUpdate.setName(book.getName());
        bookToUpdate.setStatus(book.getStatus());

        bookRepository.save(bookToUpdate);
    }

}
