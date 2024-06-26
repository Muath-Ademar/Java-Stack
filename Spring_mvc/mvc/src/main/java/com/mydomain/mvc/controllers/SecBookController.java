package com.mydomain.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.mydomain.mvc.services.BookService;

@Controller
public class SecBookController {

	@Autowired
	BookService bookservice;
	@GetMapping("/books/{id}")
	public String index() {
		return "index.jsp";
	}
}
