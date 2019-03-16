package com.classroom.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.classroom.modal.Student;
import com.classroom.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {

	   SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	   dateFormat.setLenient(false);
	   binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@GetMapping("/AddStudent")
	public ModelAndView addStudent() {
		Student student = new Student();
		System.out.println("Inside StudentController.......");
		ModelAndView modelAndView = new ModelAndView("StudentRegistration");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	@PostMapping(value = "/SaveStudent")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		System.out.println("#######################Saving Student.......");
		studentService.createStudent(student);
		ModelAndView modelAndView = new ModelAndView("StudentRegistration");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

}
