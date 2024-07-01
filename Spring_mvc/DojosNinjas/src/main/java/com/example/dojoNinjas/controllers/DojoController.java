package com.example.dojoNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojoNinjas.models.Dojo;
import com.example.dojoNinjas.models.Ninja;
import com.example.dojoNinjas.service.DojoService;
import com.example.dojoNinjas.service.NinjaService;

import jakarta.validation.Valid;

@Controller
public class DojoController {

@Autowired
	DojoService dojoService;
@Autowired
	NinjaService ninjaService;

@GetMapping("/dojos/new")
public String dojo( @ModelAttribute("newdojo") Dojo dojo){
	
	return "dojo.jsp";
}
@PostMapping("/dojos/new")
public String createDojo(@Valid @ModelAttribute("newdojo") Dojo dojo, BindingResult result, Model model) {
	if(result.hasErrors()) {
	
		return "dojo.jsp";
	}else {
		
		dojoService.createDojo(dojo);
		return "redirect:/dojos/new";
	}
}

@GetMapping("/dojos/{id}")
public String showNinjas(@PathVariable("id") Long id, Model model) {
    Dojo dojo = dojoService.findDojo(id);
    model.addAttribute("newdojo", dojo);
    return "DojosNinjas.jsp";
}
}
