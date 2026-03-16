package com.example.demo.book.repository;

import com.example.demo.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthorOrderByPriceDesc(String author);

}