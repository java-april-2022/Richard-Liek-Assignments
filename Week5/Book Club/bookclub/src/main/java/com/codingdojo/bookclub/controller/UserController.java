package com.codingdojo.bookclub.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.bookclub.model.LoginUser;
import com.codingdojo.bookclub.model.User;
import com.codingdojo.bookclub.service.UserService;



@Controller
public class UserController {
	// Bring user service functions to the controller
	@Autowired
	private UserService userService;

	// Display Home Page
	@GetMapping("/")
	public String home(@ModelAttribute("newUser") User user, @ModelAttribute("newLogin") LoginUser loginUser) {

		return "index.jsp";

	}

	// REGISTER USER!!!!!!!!!!!!!!!!!!!
	@PostMapping("/registration")
	public String register(@Valid @ModelAttribute("newUser") User user,
			BindingResult result,
			@ModelAttribute("newLogin") LoginUser loginUser,
			HttpSession session) {
		// Validate User
		userService.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		// Register User
		userService.registerUser(user);
		// Put User in Session
		session.setAttribute("loggedInUser", user);
		return "redirect:/books";
	}

	// LOGIN!!!!!!!!!!!!!!!!!!!!!!!!!
	@PostMapping("login")
	public String Login(@Valid @ModelAttribute("newLogin") LoginUser loginUser,
			BindingResult result,
			@ModelAttribute("newUser") User user,
			HttpSession session
			) {
		// Authenticate User
		userService.authenticateUser(loginUser, result);
		if (result.hasErrors()) {
			return "home.jsp";
		}
		// Put User In Session
		User LoggedInUser = userService.findUserByEmail(loginUser.getEmail());
		session.setAttribute("loggedInUser", LoggedInUser);
		return "redirect:/books";
	}

	// LOGOUT!!!!!!!!!!!!!!!
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

}

