package com.codingdojo.bookclub.service;

import java.util.Optional;

import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;

import com.codingdojo.bookclub.model.LoginUser;
import com.codingdojo.bookclub.model.User;
import com.codingdojo.bookclub.repository.UserRepository;



@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
//	User Registration Process
	public boolean validateRegistration(User user, Errors errors) {
		boolean isValid = true;
		if (findUserByEmail(user.getEmail()) != null) {
			errors.reject("email", "Invalid Email.");
			isValid = false;
		}
		if (!user.getPassword().equals(user.getConfirmPassword())) {
			errors.reject("passwordMatch", "Passwords do not match.");
			isValid = false;
		}
		return isValid;
	}
	
//	Hashes user password then sends to database
	public User registerUser(User user) {
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()));
		return userRepo.save(user);
	}
	
	public User findUserByEmail(String email) {
		Optional<User> optUser = userRepo.findByEmail(email);
		if (optUser.isPresent()) {
			return optUser.get();
		} else {
			return null;
		}
	}
	
//	User Login Process
	public User authenticateUser(LoginUser loginUser, Errors error) {
		User findUser = findUserByEmail(loginUser.getEmail());
		if(findUser != null && BCrypt.checkpw(loginUser.getPassword(), findUser.getPassword())) {
			return findUser;
		}
		return null;
	}
	
//	Ensure the Correct User is Logged in
	public boolean checkLoggedInUser(User user) {
		User compareUser = findUserByEmail(user.getEmail());
		return compareUser != null;
	}

	public void validate(@Valid User user, BindingResult result) {
		// TODO Auto-generated method stub
		
		
	}

}