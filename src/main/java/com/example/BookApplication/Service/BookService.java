package com.example.BookApplication.Service;

import com.example.BookApplication.Entity.Book;
import com.example.BookApplication.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Create a new book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    // Retrieve all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Retrieve a book by ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // Update a book
    public Book updateBook(Long id, Book bookDetails) {
        if (bookRepository.existsById(id)) {
            bookDetails.setId(id);
            return bookRepository.save(bookDetails);
        }
        return null;
    }

    // Delete a book
    public boolean deleteBook(Long id) {
        if (bookRepository.existsById(id)) {
            bookRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
