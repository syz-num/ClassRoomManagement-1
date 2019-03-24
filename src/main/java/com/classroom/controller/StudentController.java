package com.classroom.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@GetMapping("/AddStudent")
	public ModelAndView addStudent() {
		Student student = new Student();
		System.out.println("Inside StudentController.......");
		ModelAndView modelAndView = new ModelAndView("StudentRegistration");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	@PostMapping(value = "/StudentOperation")
	public ModelAndView stduentOperation(@ModelAttribute Student student) {
		System.out.println("#######################Inside StudentOperation Conttroller#############");
		ModelAndView modelAndView = null;
		if (student.getOperation().equals("Add Student")) {
			modelAndView = saveStudent(student);
		}
		if (student.getOperation().equals("Update Student")) {
			modelAndView = updateStudent(student);
		}
		if (student.getOperation().equals("Delete Student")) {
			modelAndView = deleteStudent(student);
		}
		if (student.getOperation().equals("Search Student")) {
			modelAndView = viewStudent(student);
		}
		return modelAndView;
	}

	public ModelAndView saveStudent(Student student) {
		System.out.println("#######################Saving Student#############");
		student = studentService.createStudent(student);
		ModelAndView modelAndView = new ModelAndView("StudentRegistration");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	public ModelAndView updateStudent(Student student) {
		System.out.println("#######################Update Student#############");
		student = studentService.updateStudent(student);
		ModelAndView modelAndView = new ModelAndView("StudentRegistration");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	public ModelAndView deleteStudent(Student student) {
		System.out.println("#######################delete Student#############");
		student = studentService.deleteStudent(student);
		ModelAndView modelAndView = new ModelAndView("StudentRegistration");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

	public ModelAndView viewStudent(Student student) {
		System.out.println("#######################view Student#############");
		student = studentService.getStudentById(student.getKeyUSN());
		ModelAndView modelAndView = new ModelAndView("StudentRegistration");
		modelAndView.addObject("student", student);
		return modelAndView;
	}

}
