package com.classroom.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.classroom.modal.Attendance;
import com.classroom.modal.Student;
import com.classroom.service.CommonService;

@Controller
public class AttendanceController {

	@Autowired
	private CommonService commonService;

	@RequestMapping(value = "MarkAttendance", method = RequestMethod.POST)
	public ModelAndView markAttendance(@RequestParam("subId") String subId, HttpSession session, ModelMap modelMap) {
		List<Student> studentList = commonService.findStudentsBySubId(subId);
		Attendance attendance = new Attendance();
		attendance.setSubID(subId);
		attendance.setStudents(studentList);
		ModelAndView modelAndView = new ModelAndView("Attendance");
		modelAndView.addObject("attendance", attendance);
		return modelAndView;

	}

	@RequestMapping(value = "SaveAttendance", method = RequestMethod.POST)
	public ModelAndView saveAttendance(@ModelAttribute Attendance attendance, HttpSession session, ModelMap modelMap) {
		System.out.println(attendance.toString());
		ModelAndView modelAndView = new ModelAndView("Attendance");
		modelAndView.addObject("sudentList", "");
		return modelAndView;

	}
}