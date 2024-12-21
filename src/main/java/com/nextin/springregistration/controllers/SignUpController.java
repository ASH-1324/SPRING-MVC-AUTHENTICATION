package com.nextin.springregistration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nextin.springregistration.beans.User;
import com.nextin.springregistration.services.SignUpLogic;

@Controller
public class SignUpController {

	@GetMapping("/registrationForm")
	public String signUpForm() {
		return "signup";
	}

	@PostMapping("/signup")
	public String signUp(@ModelAttribute User user) {

		int data = SignUpLogic.insertData(user);

		if (data > 0) {
			System.out.println("insertion is successful");
			return "login";
		} else {
			System.out.println("insertion is unsuccessful");
			return "signup";
		}
	}

}
