package com.classroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.classroom.ClassManagementSystemApplication;
import com.classroom.modal.Lecturer;
import com.classroom.modal.Student;
import com.classroom.service.LecturerService;

@Controller
public class LecturerController {
	
	@Autowired
	private LecturerService lecturerService; 
	
	@GetMapping("/LecturerHomePage")
	public ModelAndView lecturerHomePage() {
		Lecturer lecturer = lecturerService.getLectureById("17Is53");
		System.out.println("Inside LecturerController.......");
		ModelAndView modelAndView = new ModelAndView("LecturerHomePage");
		modelAndView.addObject("lecturer", lecturer);
		return modelAndView;
	}

	@PostMapping("/MarkAttendence")
	public ModelAndView markAttendence(@ModelAttribute Lecturer lecturer) {
		Student student = new Student();
		System.out.println("Inside StudentController.......");
		ModelAndView modelAndView = new ModelAndView("StudentRegistration");
		modelAndView.addObject("student", student);
		return modelAndView;
	}
}
