package com.codingdojo.helloworld.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.helloworld.models.Book;
import com.codingdojo.helloworld.repositories.BookRepository;

@Service
public class BookService {
private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
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
    
    //update
    public Book updateBook(Book b) {
    	return bookRepository.save(b);
    }
    
    public List<Book> booksContains(String search){
    	return bookRepository.findByDescriptionContaining(search);
    }
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if(optionalBook.isPresent()) {
			Book b = new Book();
			b.setId(id);
			b.setTitle(title);
			b.setLanguage(lang);
			b.setDescription(desc);
			b.setNumberOfPages(numOfPages);
			return bookRepository.save(b);
		}
		return null;
	}
}