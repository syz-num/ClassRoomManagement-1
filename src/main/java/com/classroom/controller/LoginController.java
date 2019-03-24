package com.classroom.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.classroom.modal.User;
import com.classroom.service.CommonService;
import com.classroom.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private CommonService commonService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView addStudent() {
		System.out.println("Inside LoginController.......");
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestParam("username") String username, @RequestParam("password") String password,
			HttpSession session, ModelMap modelMap) {
		User user = userService.getUserById(username);
		if (user.getUsername() == null) {
			modelMap.put("error", user.getMessage());
			return "index";
		}
		if (username.equalsIgnoreCase(user.getUsername()) && password.equals(user.getPassword())) {
			session.setAttribute("username", username);
			session.setAttribute("role", user.getRole());
			if (user.getRole().equalsIgnoreCase("LECTURER")) {
				List<String> subjectList = commonService.findSubjectByLecturerId(username);
				session.setAttribute("subjectList", subjectList);
				return "LecturerHomePage";
			}
			return "home";
		} else {
			modelMap.put("error", "Invalid Credentials");
			return "index";
		}
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("username");
		session.removeAttribute("role");
		return "index";
	}

}