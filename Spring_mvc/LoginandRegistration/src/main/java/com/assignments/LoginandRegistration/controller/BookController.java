package com.assignments.LoginandRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.assignments.LoginandRegistration.Models.Book;
import com.assignments.LoginandRegistration.Models.User;
import com.assignments.LoginandRegistration.service.BookService;
import com.assignments.LoginandRegistration.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	@Autowired 
	UserService userService;
	@GetMapping("/book/new")
	public String Showbookform(@ModelAttribute("book") Book books, HttpSession session, Model model ) {
		session.getAttribute("Theuser");
		List<Book> book = bookService.allBooks();
		model.addAttribute("books", book);
		return "book.jsp";
	}
	@GetMapping("/books/{id}")
	public String detailsPage(@PathVariable("id") Long id, HttpSession session, Model model) {
		Long userid = (Long) session.getAttribute("Theuser");
		Book book = bookService.findBook(id);
		model.addAttribute("Book", book);
		model.addAttribute("Theuser", userid);
		return "bookDetails.jsp";
	}
	
	@PostMapping("/new")
	public String createBook(@Valid @ModelAttribute("book") Book books, BindingResult result,HttpSession session, Model model) {
		
		if(result.hasErrors()) {

			List<Book> book = bookService.allBooks();
			model.addAttribute("books", book);
			return "book.jsp";
		}
		else {
			
			User user1 = userService.findById((Long) session.getAttribute("Theuser"));
			books.setUser((User) user1);
			bookService.createBooks(books);
			
			return "redirect:/welcome";
		}
	}
	@GetMapping("/books/{id}/edit")
	public String editPage(@PathVariable("id") Long id, Model model, HttpSession session) {
		
		Book book = bookService.findBook(id);
		model.addAttribute("book", book);
		System.out.println("*********************"+book);
		return "Edit.jsp";
	
}
	@PutMapping("/books/{id}/edit")
	public String updateBook(@Valid @ModelAttribute("book") Book books, BindingResult result,HttpSession session, Model model) {
		
		if(result.hasErrors()) {
			List<Book> book = bookService.allBooks();
			model.addAttribute("books", book);
			return "Edit.jsp";
		}
		else {
			
			User user1 = userService.findById((Long) session.getAttribute("Theuser"));
			books.setUser((User) user1);
			bookService.editBook(books);
			return "redirect:/welcome";
		}
}
    @DeleteMapping(value="/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        bookService.deleteById(id);
        return "redirect:/welcome";
    }
}
