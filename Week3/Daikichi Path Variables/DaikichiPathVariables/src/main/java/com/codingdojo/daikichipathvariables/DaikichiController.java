package com.codingdojo.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

	@RequestMapping(value="", method=RequestMethod.GET)
	public String greeting() {
		return "Welcome";
	}
	
	@RequestMapping(value="/today", method=RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all of your endeavors!";
	}
	
	@RequestMapping(value="/tomorrow", method=RequestMethod.GET)
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping(value="/travel/{city}")
	public String city(@PathVariable String city) {
		return String.format("<h1>Congratulations on graduating Coding Dojo! Enjoy your vacation in %s!</h1>" + "\n\n\n\n" + "<h2>..... I'm extremely jealous...I could really use a vacation...</h2>", city);
	}
	
	@RequestMapping(value="/lotto/{number}")
	public String lotto(@PathVariable int number) {
		if(number % 2 == 0) {
			return "<h1>She loves me.</h1>";
		}
		else {
			return "<h1>She loves me not.</h1>";
		}
	}
}
