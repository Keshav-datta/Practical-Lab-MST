package com.example.demo.book.controller;

import com.example.demo.book.entity.Book;
import com.example.demo.book.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    // CREATE
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    // READ
    @GetMapping
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    // Books by author sorted by price
    @GetMapping("/author")
    public List<Book> getBooksByAuthor(@RequestParam String author) {
        return repository.findByAuthorOrderByPriceDesc(author);
    }
}