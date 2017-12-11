package com.myPage.login;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
	    Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		System.out.println("In login html");
		
		User user = new User();
		model.addAttribute("userForm", user);
		return "login";
	}
	
	@RequestMapping(value ="loginSubmit", method=RequestMethod.POST)
	public String loginSubmitted(
			@RequestParam("username") String username ,
			@RequestParam("password") String password,
			Model model) {
		
		System.out.println("In login submit");
		
		if(username.equals("smrithi")) {
			model.addAttribute("userError", "User Already");
			return "login";
		}
		else {
			return "home";
		}
		
	}

}
