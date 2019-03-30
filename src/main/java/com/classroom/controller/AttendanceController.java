package com.classroom.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.classroom.modal.Attendance;
import com.classroom.modal.Student;
import com.classroom.service.AttendenceService;
import com.classroom.service.CommonService;

@Controller
public class AttendanceController {

	@Autowired
	private CommonService commonService;

	@Autowired
	private AttendenceService attendenceService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

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
	public String saveAttendance(@ModelAttribute Attendance attendance, HttpSession session, ModelMap modelMap) {
		System.out.println("Saving Attedence..");
		attendenceService.saveAttendace(attendance);
		return "LecturerHomePage";
	}
}