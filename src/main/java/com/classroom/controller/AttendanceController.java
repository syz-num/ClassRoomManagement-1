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

import com.classroom.modal.Student;
import com.classroom.service.CommonService;
import com.classroom.service.UserService;

@Controller
public class AttendanceController {

	@Autowired
	private CommonService commonService;

	@RequestMapping(value = "MarkAttendance", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("subId") String subId, HttpSession session, ModelMap modelMap) {
		List<Student> sudentList = commonService.findStudentsBySubId(subId);
		ModelAndView modelAndView = new ModelAndView("Attendance");
		modelAndView.addObject("sudentList", sudentList);
		return modelAndView;

	}
}