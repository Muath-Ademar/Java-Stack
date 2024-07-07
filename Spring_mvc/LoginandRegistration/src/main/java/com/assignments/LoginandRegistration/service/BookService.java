package com.assignments.LoginandRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.LoginandRegistration.Models.Book;
import com.assignments.LoginandRegistration.repositories.BookRepository;

@Service
public class BookService {
@Autowired
BookRepository bookRepository;
public List<Book> allBooks() {
    return bookRepository.findAll();
}
// creates a book
public Book createBooks(Book b) {
    return bookRepository.save(b);
}
// retrieves a book
public Book findBook(Long id) {
    Optional<Book> optionalBook = bookRepository.findById(id);
    if(optionalBook.isPresent()) {
        return optionalBook.get();
    } else {
        return null;
    }
}
public Book editBook(Book b) {
	return bookRepository.save(b);
}
public void deleteById (Long id) {
	 bookRepository.deleteById(id);
}
}
