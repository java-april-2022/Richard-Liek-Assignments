package com.codingdojo.crudsavetravel.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.crudsavetravel.models.Expense;
import com.codingdojo.crudsavetravel.services.ExpenseService;


@Controller
public class Expenses {
	private final ExpenseService expService;

	public Expenses(ExpenseService expenseService) {
		this.expService = expenseService;
	}
	
	@GetMapping("/")
	public String getHome(@ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("exp", expService.allExpenses());
		return "index.jsp";
	}
	
	@PostMapping("/newExpense")
	public String newExpense(@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("exp", expService.allExpenses());
			return "index.jsp";
		}
		else {
			expService.createExpense(expense);
			return "redirect:/";
		}
	}
	
	@GetMapping("/details/{id}")
	public String showExpense(@PathVariable long id, Model model) {
		model.addAttribute("expense", expService.getExpenseById(id));
		return "expenseDetail.jsp";
	}
	
	@GetMapping("/edit/{id}")
	public String editExpense(@PathVariable("id") Long id, Model model) {
		Expense exp = expService.getExpenseById(id);
		model.addAttribute("expense", exp);
		System.out.println("Model: " + model.getAttribute("expense"));
		if(model.getAttribute("expense") != null) {
			return "editExpense.jsp";
		}
		else {
			return "redirect:/";
		}
	}
	
	@PutMapping("/edit/{id}/commit")
	public String commitEdit(@Valid @ModelAttribute("expense") Expense expense,
			BindingResult result, @PathVariable Long id, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(expense);
			return "editExpense.jsp";
		}
		else {
			System.out.println("EXPENSE ID: " + expense.getId());
			expService.editExpense(expense);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteExpense(@PathVariable long id) {
		expService.deleteExpense(id);
		return "redirect:/";
	}
}