package com.nextin.springregistration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nextin.springregistration.beans.User;
import com.nextin.springregistration.services.LoginLogic;

@Controller
public class LoginController {

	@GetMapping("/loginform")
	public String loginForm() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute User user, Model model) {

		int flag = LoginLogic.loginLogic(user);

		if (flag > 0) {	
			return "profile";
		} else {
			model.addAttribute("errorMsg", "email or password is invalid! Try again");
			return "login";	
		}
	}

}
