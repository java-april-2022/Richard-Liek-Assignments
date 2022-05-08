package com.codingdojo.dojosandninjas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosandninjas.models.DojoModel;
import com.codingdojo.dojosandninjas.models.NinjaModel;
import com.codingdojo.dojosandninjas.services.DojoNinjaService;

@Controller
public class HomeController {
	
	@Autowired
	private DojoNinjaService dojoService;
	
	@GetMapping("/")
	public String index(Model dojomodel) {
		
		dojomodel.addAttribute("dojoLocations", dojoService.getAllDojos());
		
		return "index.jsp";
	}
	
//new ninja
	
	@GetMapping("/ninja")
	public String ninja(@ModelAttribute("newNinja") NinjaModel ninja, Model dojomodel) {
		dojomodel.addAttribute("dojos", dojoService.getAllDojos());
		return "ninja.jsp";
	}
	
	@PostMapping("/ninja/new")
	public String newNinja(@ModelAttribute("newNinja") NinjaModel ninja) {
		dojoService.createNinja(ninja);
		return "redirect:/";
	}
	
// new dojo
	
	@GetMapping("/dojo/new")
	public String dojo(@ModelAttribute("newDojo") DojoModel dojo, Model model) {
		model.addAttribute("dojos", dojoService.getAllDojos());
		return "dojos.jsp";
	}
	
	@PostMapping("/newDojo")
	public String createDojo(@ModelAttribute("newDojo") DojoModel dojo) {
		dojoService.createDojo(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/dojo/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		DojoModel thisDojo = dojoService.getOne(id);
		model.addAttribute("dojo", dojoService.getOne(id));
		model.addAttribute("theseNinjas", thisDojo.getNinjas());
		return "dojodetails.jsp";
	}
	
}
