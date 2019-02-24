package com.classroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroom.dao.StudentSubDataDao;
import com.classroom.modal.StudentSubData;

@Service
public class StudentSubDataService {
	@Autowired
	private StudentSubDataDao studentSubDataDao;

	public StudentSubData createStudentSubData(StudentSubData studentSubData) {
		return studentSubDataDao.save(studentSubData);
	}

	public StudentSubData getStudentSubDataById(String USN) {
		return studentSubDataDao.findById(USN).orElse(null);
	}

	public StudentSubData updateStudent(StudentSubData studentSubData) {
		return studentSubDataDao.save(studentSubData);
	}

	public void deleteStudent(String USN) {
		studentSubDataDao.deleteById(USN);
	}

}
