package com.classroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroom.dao.StudentDao;
import com.classroom.modal.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;

	public Student createStudent(Student student) {
		return studentDao.save(student);
	}
	
	public Student getStudentById(String USN) {
		return studentDao.findById(USN).orElse(null);
	}
	
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}
	
	public void deleteStudent(String USN) {
		studentDao.deleteById(USN);
	}
	
}
