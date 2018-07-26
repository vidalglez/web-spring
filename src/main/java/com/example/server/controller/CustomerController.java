package com.example.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.server.entity.Customer;
import com.example.server.rest.client.CustomerClient;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	//private CustomerDAO customerDAO;
	private CustomerClient customerClient;

	@GetMapping("/list")
	public String getCustomerList(Model model) {
		model.addAttribute("customers", customerClient.getCustomers());
		return "customer-list";
	}
	
	@GetMapping("/getcustomer")
	public String getCustomer(@RequestParam("id") Integer id, Model model) {
		model.addAttribute("customer", customerClient.getCustomer(id));
		return "customer-form";
	}
	
	@GetMapping("/showCustomerForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}
	
	@GetMapping("/showEditCustomerForm")
	public String showEditForm(@RequestParam("id") Integer id, Model model) {
		model.addAttribute("customer", customerClient.getCustomer(id));
		return "customer-form";
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		int status = customerClient.saveCustomer(customer);
		System.out.println("Status: " + status);
		return "redirect:/customers/list";
	}
}
