package com.example.burger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.burger.models.Burger;
import com.example.burger.reposetories.BurgerRepository;

@Service
public class BurgerService {
	private final BurgerRepository burgerRepository;
    public BurgerService(BurgerRepository burgerRepository) {
        this.burgerRepository = burgerRepository;
    }
    public List<Burger> allBurgers(){
    	return burgerRepository.findAll();
    }
    public Burger createBurger(Burger b) {
    	return burgerRepository.save(b);
    }
    public Burger findBook(Long id) {
        Optional<Burger> optionalBurger = burgerRepository.findById(id);
        if(optionalBurger.isPresent()) {
            return optionalBurger.get();
        } else {
            return null;
        }

    }
}