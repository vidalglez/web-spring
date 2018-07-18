package com.example.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.server.dao.CustomerDAO;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDAO;

	@RequestMapping("/list")
	public String getCustomerList(Model model) {
		model.addAttribute("customers", customerDAO.getCustomers());
		return "customer-list";
	}
}
