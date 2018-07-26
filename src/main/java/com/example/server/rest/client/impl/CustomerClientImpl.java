package com.example.server.rest.client.impl;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.example.server.entity.Customer;
import com.example.server.rest.client.CustomerClient;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Component
public class CustomerClientImpl implements CustomerClient {

	public static final String CUSTOMER_URL = "http://localhost:8080/restws/services/customerservice/";

	@Override
	public Customer getCustomer(Integer id) {
		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);
		WebTarget target = client.target(CUSTOMER_URL).path("/customer").path("/{id}").resolveTemplate("id", id);
		Customer customer = target.request(MediaType.APPLICATION_JSON).get(Customer.class);
		client.close();
		return customer;
	}

	@Override
	public List<Customer> getCustomers() {
		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);
		WebTarget target = client.target(CUSTOMER_URL).path("/customers");
		List<Customer> customer = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Customer>>() { });
		return customer;
	}
	
	public int saveCustomer(Customer customer) {
		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);
		WebTarget target = client.target(CUSTOMER_URL).path("/customer");
		Response response = target.request().post(Entity.entity(customer, MediaType.APPLICATION_JSON));
		return response.getStatus();
	}

}
