package com.example.dojoNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dojoNinjas.models.Dojo;
import com.example.dojoNinjas.models.Ninja;
import com.example.dojoNinjas.service.DojoService;
import com.example.dojoNinjas.service.NinjaService;

@Controller
public class NinjaController {
	
	@Autowired
	NinjaService ninjaService;
	@Autowired
	DojoService  dojoService;
@GetMapping("/ninjas")
public String ninja(@ModelAttribute("ninjas") Ninja ninja, Model model) {
	List<Dojo> dojos = dojoService.allDojos();
model.addAttribute("dojos", dojos);
	return "Ninja.jsp";
}
	
	@PostMapping("/ninjas")
public String createNinja(@ModelAttribute("ninjas") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			
			return "Ninja.jsp";
		}else {
			
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas";
		}

}
}
