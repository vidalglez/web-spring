package com.example.server.rest.client.impl;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.example.server.entity.Student1;
import com.example.server.rest.client.StudentClient;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Component
public class StudentClientImpl implements StudentClient {
	
	private static final String SERVICE_URL = "http://localhost:8080/restws/services/studentservice";
	
	private WebTarget target;

	@Override
	public List<Student1> getStudents() {
		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);
		target = client.target(SERVICE_URL).path("/students");
		List<Student1> students = target.request(MediaType.APPLICATION_JSON).get(new GenericType<List<Student1>>() { });
		client.close();
		return students;
	}
	
	@Override
	public Student1 getStudent(Integer id) {
		Client client = ClientBuilder.newClient().register(JacksonJsonProvider.class);
		target = client.target(SERVICE_URL).path("/student").path("/{id}").resolveTemplate("id", id);
		Student1 student = target.request(MediaType.APPLICATION_JSON).get(Student1.class);
		client.close();
		System.out.println("Id: " + student.getId() +  ", Name: " + student.getFirstName() + ", Last Name: " + student.getLastName());
		return student;
	}

}
