package com.codingdojo.crudsavetravel.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.crudsavetravel.models.Expense;
import com.codingdojo.crudsavetravel.repositories.ExpenseRepository;

@Service
public class ExpenseService {	
	private final ExpenseRepository expRepo;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		expRepo = expenseRepository;
	}
	
	public List<Expense> allExpenses() {
		return expRepo.findAll();
	}
	
	public Expense createExpense(Expense expense) {
		return expRepo.save(expense);
	}
	
	
	public Expense getExpenseById(long id) {
		Optional<Expense> optionalExp = expRepo.findById(id);
		if(optionalExp.isPresent()) {
			return optionalExp.get();
		}
		else {
			return null;
		}
	}
	
	public void deleteExpense(long id) {
		expRepo.deleteById(id);
	}
}