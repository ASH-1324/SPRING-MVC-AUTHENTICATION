package com.nextin.springregistration.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nextin.springregistration.beans.User;
import com.nextin.springregistration.services.ForgotPasswordLogic;

@Controller
public class ForgotPasswordController {

	@GetMapping("/forgotpassword")
	public String forgotPasswordForm() {
		return "forgotpassword";
	}

	@PostMapping("/updatepassword")
	public String updatePassword(@ModelAttribute User user, Model model) {

		int flag = ForgotPasswordLogic.updatePassword(user);

		if (flag == 1) {
			System.out.println("password is updated successfullly");
			return "login";
		} else {
			model.addAttribute("errorMsg", "email is invalid! enter a correct email id");
			return "forgotpassword";
		}

	}
}
