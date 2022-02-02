package com.vicko.SprinBootCurso1.Bootstrap;

import com.vicko.SprinBootCurso1.Model.Author;
import com.vicko.SprinBootCurso1.Model.Book;
import com.vicko.SprinBootCurso1.Model.Publisher;
import com.vicko.SprinBootCurso1.Repositories.AuthorRepository;
import com.vicko.SprinBootCurso1.Repositories.BookRepository;
import com.vicko.SprinBootCurso1.Repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//Con esto le indicamos a Spring que este es un componente de nuestra aplicación

@Component
public class BootStrapData implements CommandLineRunner {

    //Ahora aplicamos la inyección de dependencias
    private final AuthorRepository autorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository autorRepository, BookRepository bookRepository, PublisherRepository publisherRepository ) {
        this.autorRepository = autorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author autor1 = new Author("Mariano" , "Casas");
        Book book1 = new Book("La verdad verdad", "123456789-ABCDEFG");

        autor1.getBooks().add(book1);
        book1.getAuthors().add(autor1);

        autorRepository.save(autor1);
        bookRepository.save(book1);

        Author autor2 = new Author("Jules", "Verne");
        Book book2 = new Book("La vuelta al mundo en 80 dias", "234567890-JIKLMNO");

        autor2.getBooks().add(book2);
        book2.getAuthors().add(autor2);

        autorRepository.save(autor2);
        bookRepository.save(book2);


        Publisher publisher1 = new Publisher("Penguin House","Chelsea Street 434", "London", "England", 134567);

        book1.setPublisher(publisher1);
        publisher1.getBooks().add(book1);
        publisherRepository.save(publisher1);

        book2.setPublisher(publisher1);
        publisher1.getBooks().add(book2);

        publisherRepository.save(publisher1);

        System.out.println("Getting started...");
        System.out.println("Number of authors " + autorRepository.count());
        System.out.println("Number of publishers " + publisherRepository.count());
        System.out.println("Number of books from publishers " + publisher1.getBooks().size());


    }
}
