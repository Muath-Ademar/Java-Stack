package com.codingdojo.productsandcategories.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.services.CategoryService;
import com.codingdojo.productsandcategories.services.ProductService;

import jakarta.validation.Valid;

@Controller
public class CategoryController {
@Autowired 
CategoryService categoryService;
@Autowired 
ProductService productService;
	@GetMapping("/category")
	public String category() {
		return "Categorypage.jsp";
		
	}
	@GetMapping("/category/new")
	public String showCategoryForm(@ModelAttribute("category") Category category, Model model) {
		model.addAttribute("categories", category);
		return "addcategory.jsp";
		
	}
	@PostMapping("/add")
	public String creatCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "addcategory.jsp";
		}
		else {
		categoryService.createCategory(category);
			return "redirect:/";
		}
	}
	@GetMapping("/categories/{categoryid}")
	public String categoriesPage(@PathVariable("categoryid") Long categoryid, Model model) {
		Category category = categoryService.findCategory(categoryid);
		model.addAttribute("assigned",productService.productsAssigned(category));
		model.addAttribute("unassigned", productService.productsNotAssigned(category));
		model.addAttribute("categories", category);
		return "Categorypage.jsp";
	}
	@PostMapping("/categories/{categoryid}")
	public String addCategoriestoProducts(@PathVariable("categoryid") Long categoryid, @RequestParam(value="productId", required = false) Long productid,
			Model model) {
		Product product = productService.findProduct(productid);
		Category category = categoryService.findCategory(categoryid);
		category.getProducts().add(product);
		categoryService.UpdateCategory(category);
		return "redirect:/categories/{categoryid}";
	}
}
