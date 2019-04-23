package com.classroom.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

import com.classroom.dao.StudentSubDataDao;
import com.classroom.modal.Attendance;
import com.classroom.modal.Student;
import com.classroom.modal.StudentData;
import com.classroom.modal.StudentSubData;
import com.classroom.modal.Subject;
import com.classroom.service.AttendenceService;
import com.classroom.service.CommonService;
import com.classroom.service.StudentSubDataService;
import com.classroom.service.SubjectService;

@Controller
public class LeturerOperationController {

	@Autowired
	private CommonService commonService;

	@Autowired
	private AttendenceService attendenceService;

	@Autowired
	private SubjectService subjectService;

	@Autowired
	private StudentSubDataService studentSubDataService;

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
		Subject subject = subjectService.getSubjectById(subId);
		attendance.setSubName(subject.getSubName());
		attendance.setSubID(subId);
		attendance.setStudents(studentList);
		ModelAndView modelAndView = new ModelAndView("Attendance");
		modelAndView.addObject("attendance", attendance);
		return modelAndView;

	}

	@RequestMapping(value = "SaveAttendance", method = RequestMethod.POST)
	public String saveAttendance(@ModelAttribute Attendance attendance, HttpSession session, ModelMap modelMap) {
		System.out.println("Saving Attedence..");
		Subject subject = subjectService.getSubjectById(attendance.getSubID());
		subject.setCourseStage(attendance.getCourseStage());
		subjectService.updateSubject(subject);
		attendenceService.saveAttendace(attendance);
		return "LecturerHomePage";
	}

	@RequestMapping(value = "UpdateStudentData", method = RequestMethod.POST)
	public ModelAndView updateStudentsData(@RequestParam("subId") String subId, HttpSession session,
			ModelMap modelMap) {
		List<Student> studentList = commonService.findStudentsBySubId(subId);
		List<StudentSubData> studentSubDatas = new ArrayList<>();
		for (Student student : studentList) {
			StudentSubData data = studentSubDataService.getStudentSubDataById(student.getUSN(), subId);
			studentSubDatas.add(data);
		}
		StudentData studentData = new StudentData();
		studentData.setDatas(studentSubDatas);
		studentData.setSubId(subId);
		ModelAndView modelAndView = new ModelAndView("StudentData");
		modelAndView.addObject("studentsData", studentData);
		return modelAndView;

	}

	@RequestMapping(value = "SaveStudentData", method = RequestMethod.POST)
	public String saveStudentData(@ModelAttribute StudentData studentData, HttpSession session, ModelMap modelMap) {
		System.out.println("Saving SaveStudentData..");
		for (StudentSubData studentSubData : studentData.getDatas()) {
			studentSubDataService.updateStudentSubData(studentSubData);
		}

		return "LecturerHomePage";
	}

}