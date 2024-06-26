package com.example.burger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.burger.models.Burger;
import com.example.burger.services.BurgerService;

import jakarta.validation.Valid;


@Controller
public class BurgerController {
	@Autowired
	BurgerService burgerService;
	
    @GetMapping("/")
    public String index(@ModelAttribute("burger")Burger burger, Model model) {
    	List<Burger> burgers = burgerService.allBurgers();
    	model.addAttribute( "burgers",burgers);
    	System.out.println("hiiiiiiiiiiiiiiiiii");
    	return "index.jsp";
    }
    
    @PostMapping("/burgers/new")
    public String create(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            burgerService.createBurger(burger);
            return "redirect:/burgers";
        }
    }

}
