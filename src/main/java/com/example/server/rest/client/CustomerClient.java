package com.example.server.rest.client;

import java.util.List;

import com.example.server.entity.Customer;

public interface CustomerClient {
	
	Customer getCustomer(Integer id);
	
	List<Customer> getCustomers();
	
	int saveCustomer(Customer c);
	
}
