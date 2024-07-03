package com.example.savetravels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.savetravels.models.Expense;
import com.example.savetravels.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {

	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public String show(@ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("expenses", expenseService.allExpenses());
		return "expenses.jsp";
	}
	@PostMapping("/new")
	public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
		if(result.hasErrors()) {
			return "expenses.jsp";
		}
		else {
			expenseService.createExpenses(expense);
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model model) {
		Expense expense = expenseService.findExpenses(id);
		model.addAttribute("expense", expense );
		return "edit.jsp";
	}
	
	@PutMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("expense") Expense expense, BindingResult result ) {
		if(result.hasErrors()) {
			return "edit.jsp";
		}
		else {
			expenseService.editExpenses(expense);
			return "redirect:/expenses";
		}
	}
    @DeleteMapping(value="/delete/{id}")
    public String destroy(@PathVariable("id") Long id) {
        expenseService.deleteById(id);
        return "redirect:/expenses";
    }
}
