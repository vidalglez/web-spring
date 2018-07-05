package com.example.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.server.entity.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "show-student-form";
	}
	
	@RequestMapping("/processForm")
	public String processStudentForm(@ModelAttribute("student") Student student) {
		System.out.println("Student data possibly to store in DB: " + student.getFirstName() + " " + student.getLastName());
		return "confirm-student";
	}

}
