package com.example.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.savetravels.models.Expense;



@Repository
public interface Expenses extends CrudRepository<Expense, Long> {
	List<Expense> findAll();

}
