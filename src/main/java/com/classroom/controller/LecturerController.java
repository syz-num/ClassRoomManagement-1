package com.classroom.controller;

import java.sql.Date;
import java.text.DateFormat;
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

import com.classroom.modal.Lecturer;
import com.classroom.modal.User;
import com.classroom.service.LecturerService;
import com.classroom.service.UserService;

@Controller
public class LecturerController {

	@Autowired
	private LecturerService lecturerService;

	@Autowired
	private UserService userService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@GetMapping("/AddLecturer")
	public ModelAndView addLecturer() {
		Lecturer lecturer = new Lecturer();
		System.out.println("Inside LecturerController.......");
		ModelAndView modelAndView = new ModelAndView("LecturerRegistration");
		modelAndView.addObject("lecturer", lecturer);
		return modelAndView;
	}

	@PostMapping(value = "/LecturerOperation")
	public ModelAndView stduentOperation(@ModelAttribute Lecturer lecturer) {
		System.out.println("#######################Inside LecturerOperation Conttroller#############");
		ModelAndView modelAndView = null;
		User user = new User();
		user.setUsername(lecturer.getID());
		user.setEmail(lecturer.geteMail());
		user.setRole("LECTURER");
		DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
		user.setPassword(dateFormat.format(lecturer.getDOJ()));

		if (lecturer.getOperation().equals("Add Lecturer")) {
			modelAndView = saveLecturer(lecturer);
			userService.createUser(user);
		}
		if (lecturer.getOperation().equals("Update Lecturer")) {
			modelAndView = updateLecturer(lecturer);
			userService.updateUser(user);
		}
		if (lecturer.getOperation().equals("Delete Lecturer")) {
			modelAndView = deleteLecturer(lecturer);
			userService.deleteUser(user);
		}
		if (lecturer.getOperation().equals("Search Lecturer")) {
			modelAndView = viewLecturer(lecturer);
		}
		return modelAndView;
	}

	public ModelAndView saveLecturer(Lecturer lecturer) {
		System.out.println("#######################Saving Lecturer#############");
		lecturer = lecturerService.createLecturer(lecturer);
		ModelAndView modelAndView = new ModelAndView("LecturerRegistration");
		modelAndView.addObject("lecturer", lecturer);
		return modelAndView;
	}

	public ModelAndView updateLecturer(Lecturer lecturer) {
		System.out.println("#######################Update Lecturer#############");
		lecturer = lecturerService.updateLecturer(lecturer);
		ModelAndView modelAndView = new ModelAndView("LecturerRegistration");
		modelAndView.addObject("lecturer", lecturer);
		return modelAndView;
	}

	public ModelAndView deleteLecturer(Lecturer lecturer) {
		System.out.println("#######################delete Lecturer#############");
		lecturer = lecturerService.deleteLecturer(lecturer);
		ModelAndView modelAndView = new ModelAndView("LecturerRegistration");
		modelAndView.addObject("lecturer", lecturer);
		return modelAndView;
	}

	public ModelAndView viewLecturer(Lecturer lecturer) {
		System.out.println("#######################view Lecturer#############");
		lecturer = lecturerService.getLectureById(lecturer.getKeyID());
		ModelAndView modelAndView = new ModelAndView("LecturerRegistration");
		modelAndView.addObject("lecturer", lecturer);
		return modelAndView;
	}

}