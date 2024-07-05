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
import com.codingdojo.productsandcategories.repositories.ProductRepository;
import com.codingdojo.productsandcategories.services.CategoryService;
import com.codingdojo.productsandcategories.services.ProductService;

import jakarta.validation.Valid;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	@Autowired
	ProductRepository productRepo;

	@GetMapping("/product")
	public String productpage() {
		return "Productpage.jsp";
	}

	@GetMapping("/product/new")
	public String productForm(@ModelAttribute("product") Product product) {
		return "addproduct.jsp";
	}

	@PostMapping("/addProduct")
	public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) {
			return "addproduct.jsp";
		} else {

			productService.createProduct(product);
			return "redirect:/";
		}
	}

	@GetMapping("/products/{productid}")
	public String showUpdateProduct(@PathVariable("productid") Long productid, Model model) {
		Product product = productService.findProduct(productid); 
		model.addAttribute("products", product);
		model.addAttribute("assigned", categoryService.assigned(product));
		model.addAttribute("unassigned", categoryService.NotAssigned(product));
		return "Productpage.jsp";
}

	@PostMapping("/products/{productid}")
	public String updateProduct(@PathVariable("productid") Long productid, Model model,
			@RequestParam("categoryId") Long categoryId) {
		Category category = categoryService.findCategory(categoryId);
		Product product = productService.findProduct(productid);
		product.getCategories().add(category);
		productService.UpdateProduct(product);
		return "redirect:/products/{productid}";
	}

}


