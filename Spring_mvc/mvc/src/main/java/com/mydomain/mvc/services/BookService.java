package com.mydomain.mvc.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mydomain.mvc.model.Book;
import com.mydomain.mvc.repositories.BookRepository;

import jakarta.validation.constraints.AssertFalse.List;

@Service
public class BookService {
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public java.util.List<Book> allBooks() {
		return bookRepository.findAll();
	}

	// creates a book
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	// updates a book
		public Book updateBook(Long id ,String title, String desc,String lang,Integer numOfPages) {
			Optional<Book> book = bookRepository.findById(id);
			if( book.isPresent()) {
				
				Book b = book.get();
				b.setLanguage(lang);
				b.setDescription(desc);
				b.setTitle(title);
				b.setNumberOfPages(numOfPages);
				return bookRepository.save(b);
				}
			return null ; 
		}
		public void deleteBook(Long id) {
			bookRepository.deleteById(id);
		}

}
