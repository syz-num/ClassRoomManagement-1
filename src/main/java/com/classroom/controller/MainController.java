package com.classroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.classroom.modal.Subject;

@Controller
public class MainController {
	
	
	@GetMapping("/AddSubject")
	public ModelAndView addSubject() {
		 Subject subject  = new Subject();		 
         System.out.println("Inside SubjectController.......");
         ModelAndView modelAndView = new ModelAndView("SubjectRegistration");
         modelAndView.addObject("subject", subject);
         return modelAndView;
	}
}
