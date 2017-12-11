package com.myPage.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.*;


@Controller
public class RegistrationController {

	@RequestMapping(value="reg", method=RequestMethod.GET)
	public String openRegPage(Model model) {
		 System.out.println("In login form...");
		Registration reg = new Registration();
		model.addAttribute("reg", reg);
		return "registartion";
	}
	
	@RequestMapping(value ="regSubmit", method=RequestMethod.POST)
	public String regSubmit(
			@Valid
			@ModelAttribute("reg")
			Registration reg,
			BindingResult bindingResult,
			Model model) {
		if(bindingResult.hasErrors()) {
			return "registartion";
		}
		else {
			model.addAttribute("regError", "User Already");
			return "home";
		}
		
	}
}
