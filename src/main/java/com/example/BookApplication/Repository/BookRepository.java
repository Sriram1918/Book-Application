package com.example.BookApplication.Repository;

import com.example.BookApplication.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Additional query methods can be defined here
}
