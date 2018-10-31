package com.example.student.web.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.student.web.service.LoginService;

@Controller
//change
@SessionAttributes("name")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	
	@RequestMapping(value="/login",   method=RequestMethod.GET)
	public String showLoginForm(ModelMap model)
	{
		return "login";
	}
	
	@RequestMapping(value="/login",   method=RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name,
			@RequestParam String password)
	{
		boolean isValidUser=service.validUser(name,password);
		if(!isValidUser)
		{
			model.put("errorMessage","InvalidCredentials");
		}
		model.put("name", name);
        model.put("password", password);
		return "welcome";
	}

}
