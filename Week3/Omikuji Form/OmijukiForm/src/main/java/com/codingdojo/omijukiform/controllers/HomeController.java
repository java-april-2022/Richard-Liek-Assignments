package com.codingdojo.omijukiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	private String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/results")
	private String results(Model models, 
			@RequestParam Integer number, 
			@RequestParam String city,
			@RequestParam String name,
			@RequestParam String hobby,
			@RequestParam String animal,
			@RequestParam String sayNice){
		
		models.addAttribute("number", number);
		models.addAttribute("city", city);
		models.addAttribute("name", name);
		models.addAttribute("hobby", hobby);
		models.addAttribute("animal", animal);
		models.addAttribute("sayNice", sayNice);
		
		return "results.jsp";
	}
}
