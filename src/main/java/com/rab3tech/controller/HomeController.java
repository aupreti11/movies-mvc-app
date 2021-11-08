package com.rab3tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rab3tech.dao.LoginDao;

@Controller

public class HomeController {
	
	@Autowired
	private LoginDao loginDao;

	@GetMapping("/")
	public String display() {
		return "index";
	}
	
	@GetMapping("/paa")
	public String show() {
		return "index";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "clogin";
	}
	
	/*
	@PostMapping("/login")
	public String loginSubmit(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if("amrit".equals(username) && "upreti".equals(password)) {
			return "home";
		}
		else {
			request.setAttribute("message", "Hey " +username+" username or password is incorrect");
			return "clogin";
		}
		
	} this is the old jsp servlet style below is the spring style
	*/
	
	
	@PostMapping("/login")
	public String loginSubmit(@RequestParam String username, @RequestParam String password, Model model) {
		// model is a hashmap whatever data you want to carry from controller to jsp you add into the model 
		// key value pair
		boolean status=loginDao.validateUser(username, password);
		if(status) {
			model.addAttribute("message", "Welcome " +username+ "");
			return "home";
		}
		else {
			model.addAttribute("message", "Hey " +username+" username or password is incorrect");
			return "clogin";
		}	
	} 	
}
