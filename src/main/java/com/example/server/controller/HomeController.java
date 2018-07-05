package com.example.server.controller;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("/")
	public String goToIndex() {
		System.out.println("Inside IndexController");
		return "index";
	}
	
	@RequestMapping("/welcomeHome")
	public String welcomeHome( @RequestParam("user") String user, Model model) {
	//public String welcomeHome(HttpServletRequest request, Model model) {
		//String user = request.getParameter("user");
		model.addAttribute("customizedTitle", "Welcome " + user);
		return "welcome-home";
	}
}
