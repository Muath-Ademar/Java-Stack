package com.codingdojo.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.services.CategoryService;
import com.codingdojo.productsandcategories.services.ProductService;

@Controller
public class MainController {

	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductService productService;
	@GetMapping("/")
	public String home(@ModelAttribute("category") Category category, Model model) {
		model.addAttribute("categories", categoryService.allCategories());
		model.addAttribute("products", productService.allProducts());
		return "home.jsp";
	}
}
