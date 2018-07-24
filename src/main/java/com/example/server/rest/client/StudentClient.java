package com.example.server.rest.client;

import java.util.List;

//import javax.ws.rs.client.Client;
//import javax.ws.rs.client.ClientBuilder;

import com.example.server.entity.Student1;

public interface StudentClient {	
	
	List<Student1> getStudents();
	
	Student1 getStudent(Integer id);

}
