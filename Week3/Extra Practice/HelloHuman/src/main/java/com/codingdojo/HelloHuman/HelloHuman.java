package com.codingdojo.HelloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String index(@RequestParam(required=false) String name, @RequestParam(required=false) String last_name) {
		if(name == null) {
			return "Hello Human";
		}
		else if(last_name == null) {
			return "Hello Human";
		}
		else {
			return String.format("Hello %s %s", name, last_name);
		}
	}
	
}
