package com.codingdojo.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepo;
    // returns all the books
    public List<Product> allProducts() {
        return productRepo.findAll();
    }
    // creates a book
    public Product createProduct(Product p) {
        return productRepo.save(p);
    }
    // retrieves a book
    public Product findProduct(Long id) {
        Optional<Product> optionalProduct = productRepo.findById(id);
        if(optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            return null;
        }
    }
    public Product UpdateProduct(Product p) {
    	return productRepo.save(p);
    }
    public void deleteById (Long id) {
    	 productRepo.deleteById(id);
    }
    
    public List<Product> productsNotAssigned(Category category) {
    	return productRepo.findByCategoriesNotContaining(category);
    }
    public List<Product> productsAssigned(Category category){
    	return productRepo.findAllByCategories(category);
    }
}
