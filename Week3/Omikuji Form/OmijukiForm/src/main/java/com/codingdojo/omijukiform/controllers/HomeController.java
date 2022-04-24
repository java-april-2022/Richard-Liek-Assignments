package com.codingdojo.omijukiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	private String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/results")
	private String results(HttpSession session, 
			@RequestParam Integer number, 
			@RequestParam String city,
			@RequestParam String name,
			@RequestParam String hobby,
			@RequestParam String animal,
			@RequestParam String sayNice){
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("name", name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("animal", animal);
		session.setAttribute("sayNice", sayNice);
		
		return "results.jsp";
	}
}
