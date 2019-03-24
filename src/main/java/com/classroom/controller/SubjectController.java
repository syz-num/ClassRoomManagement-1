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

import com.classroom.modal.Subject;
import com.classroom.service.SubjectService;

@Controller
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@GetMapping("/AddSubject")
	public ModelAndView addSubject() {
		Subject subject = new Subject();
		System.out.println("Inside SubjectController.......");
		ModelAndView modelAndView = new ModelAndView("SubjectRegistration");
		modelAndView.addObject("subject", subject);
		return modelAndView;
	}

	@PostMapping(value = "/SubjectOperation")
	public ModelAndView stduentOperation(@ModelAttribute Subject subject) {
		System.out.println("#######################Inside SubjectOperation Conttroller#############");
		ModelAndView modelAndView = null;
		if (subject.getOperation().equals("Add Subject")) {
			modelAndView = saveSubject(subject);
		}
		if (subject.getOperation().equals("Update Subject")) {
			modelAndView = updateSubject(subject);
		}
		if (subject.getOperation().equals("Delete Subject")) {
			modelAndView = deleteSubject(subject);
		}
		if (subject.getOperation().equals("Search Subject")) {
			modelAndView = viewSubject(subject);
		}
		return modelAndView;
	}

	public ModelAndView saveSubject(Subject subject) {
		System.out.println("#######################Saving Subject#############");
		subject = subjectService.createSubject(subject);
		ModelAndView modelAndView = new ModelAndView("SubjectRegistration");
		modelAndView.addObject("subject", subject);
		return modelAndView;
	}

	public ModelAndView updateSubject(Subject subject) {
		System.out.println("#######################Update Subject#############");
		subject = subjectService.updateSubject(subject);
		ModelAndView modelAndView = new ModelAndView("SubjectRegistration");
		modelAndView.addObject("subject", subject);
		return modelAndView;
	}

	public ModelAndView deleteSubject(Subject subject) {
		System.out.println("#######################delete Subject#############");
		subject = subjectService.deleteSubject(subject);
		ModelAndView modelAndView = new ModelAndView("SubjectRegistration");
		modelAndView.addObject("subject", subject);
		return modelAndView;
	}

	public ModelAndView viewSubject(Subject subject) {
		System.out.println("#######################view Subject#############");
		subject = subjectService.getSubjectById(subject.getKeyID());
		ModelAndView modelAndView = new ModelAndView("SubjectRegistration");
		modelAndView.addObject("subject", subject);
		return modelAndView;
	}

}
