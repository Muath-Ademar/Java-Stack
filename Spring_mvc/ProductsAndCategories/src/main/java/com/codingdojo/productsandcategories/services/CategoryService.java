package com.codingdojo.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepo;
    // returns all the books
    public List<Category> allCategories() {
        return categoryRepo.findAll();
    }
    // creates a book
    public Category createCategory(Category c) {
        return categoryRepo.save(c);
    }
    // retrieves a book
    public Category findCategory(Long id) {
        Optional<Category> optionalCategory = categoryRepo.findById(id);
        if(optionalCategory.isPresent()) {
            return optionalCategory.get();
        } else {
            return null;
        }
    }
    public Category UpdateCategory(Category c) {
    	return categoryRepo.save(c);
    }
    public void deleteById (Long id) {
    	 categoryRepo.deleteById(id);
    }
    
    public List<Category> assigned(Product product){
    	return categoryRepo.findAllByProducts(product);
    }
    public List<Category> NotAssigned(Product product){
    	return categoryRepo.findByProductsNotContains(product);
    }
}

