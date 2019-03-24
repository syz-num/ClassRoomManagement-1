package com.classroom.service;

import java.util.List;

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

	public Student updateStudent(Student student) {
		return studentDao.update(student);
	}

	public Student getStudentById(String USN) {
		return studentDao.findById(USN);
	}

	public List<Student> getStudentBySubId(String subId) {
		return studentDao.findBySubectId(subId);
	}

	public Student deleteStudent(Student student) {
		return studentDao.deleteById(student);
	}

}
