package com.classroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.classroom.modal.Lecturer;
import com.classroom.modal.Student;
import com.classroom.modal.Subject;

@Controller
public class MainController {
	
	@GetMapping("/AddStudent")
	public ModelAndView addStudent() {
		 Student student = new Student();		 
         System.out.println("Inside StudentController.......");
         ModelAndView modelAndView = new ModelAndView("StudentRegistration");
         modelAndView.addObject("student", student);
         return modelAndView;
	}
	@GetMapping("/AddLecturer")
	public ModelAndView addLecturer() {
		 Lecturer lecturer = new Lecturer();
         System.out.println("Inside LecturerController.......");
         ModelAndView modelAndView = new ModelAndView("LecturerRegistration");
         modelAndView.addObject("lecturer", lecturer);
         return modelAndView;
	}
	@GetMapping("/AddSubject")
	public ModelAndView addSubject() {
		 Subject subject  = new Subject();		 
         System.out.println("Inside SubjectController.......");
         ModelAndView modelAndView = new ModelAndView("SubjectRegistration");
         modelAndView.addObject("subject", subject);
         return modelAndView;
	}
}
