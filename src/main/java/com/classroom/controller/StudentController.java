package com.classroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.classroom.modal.Student;

@Controller
public class StudentController {
	
	@GetMapping("/ResiterStudent")
	public ModelAndView passParametersWithModelAndView() {
		 Student student = new Student();
		 student.setfName("ullas");
         System.out.println("Inside StudentController.......");
         ModelAndView modelAndView = new ModelAndView("StudentRegestration");
         modelAndView.addObject("student", student);
         return modelAndView;
	}

}
