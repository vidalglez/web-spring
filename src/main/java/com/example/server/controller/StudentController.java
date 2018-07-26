package com.example.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.server.entity.Student;
import com.example.server.rest.client.StudentClient;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentClient studentClient;
	
	@RequestMapping("/showForm")
	public String showStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "show-student-form";
	}
	
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") Student student) {
		System.out.println("Student data possibly to store in DB: " 
				+ student.getFirstName() + " " + student.getLastName() + " " + student.getCountry() + " " + student.getFavoriteLanguage());
		return "confirm-student";
	}
	
	@RequestMapping("/list")
	public String getStudents( Model model) {
		System.out.println("Getting data from students service client");
		model.addAttribute("students", studentClient.getStudents());
		return "students-list";
	}
	
	@RequestMapping("/getstudent")
	public String getStudent(HttpServletRequest request, Model model) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		System.out.println("Getting data from student service client, id: " + id);
		
		model.addAttribute("student", studentClient.getStudent(id));
		return "students-list";
	}

}
