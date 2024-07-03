package com.example.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.savetravels.models.Expense;
import com.example.savetravels.models.Expense;
import com.example.savetravels.repositories.Expenses;

@Service
public class ExpenseService {
	@Autowired
	Expenses expenseRepo;
    // returns all the books
    public List<Expense> allExpenses() {
        return expenseRepo.findAll();
    }
    // creates a book
    public Expense createExpenses(Expense e) {
        return expenseRepo.save(e);
    }
    // retrieves a book
    public Expense findExpenses(Long id) {
        Optional<Expense> optionalExpenses = expenseRepo.findById(id);
        if(optionalExpenses.isPresent()) {
            return optionalExpenses.get();
        } else {
            return null;
        }
    }
    public Expense editExpenses(Expense e) {
    	return expenseRepo.save(e);
    }
    public void deleteById (Long id) {
    	 expenseRepo.deleteById(id);
    }
}