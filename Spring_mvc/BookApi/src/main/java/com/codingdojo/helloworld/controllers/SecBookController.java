package com.codingdojo.helloworld.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.helloworld.models.Book;
import com.codingdojo.helloworld.service.BookService;

@Controller
public class SecBookController {

	@Autowired
	BookService bookservice;
	
	@GetMapping("/books/{bookId}")
	public String index( Model model, @PathVariable("bookId") Long bookId) {
		System.out.println(bookId);
		Book book = bookservice.findBook(bookId);
		model.addAttribute("book", book);
		return "index.jsp";
	}
    @GetMapping("/books")
    public String index(Model model) {
        List<Book> books = bookservice.allBooks();
        model.addAttribute("books", books);
        return "Books.jsp";
    }
}
