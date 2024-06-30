package com.example.burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.burger.models.Burger;
import com.example.burger.repositeries.BurgerRepositery;

@Service
public class BurgerService {
    
    private final BurgerRepositery burgerRepository;
    
    public BurgerService(BurgerRepositery bookRepository) {
        this.burgerRepository = bookRepository;
    }
    
    public List<Burger> allBurgers() {
        return burgerRepository.findAll();
    }
    
    public Burger createBurger(Burger b) {
        return burgerRepository.save(b);
    }
    
    public Burger findBurger(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }
    }
}
