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

	public StudentSubData getStudentSubDataById(String USN, String subId) {
		return studentSubDataDao.findById(USN, subId);
	}

	public StudentSubData updateStudentSubData(StudentSubData studentSubData) {
		return studentSubDataDao.update(studentSubData);
	}

	public void deleteStudent(StudentSubData studentSubData) {
		studentSubDataDao.deleteById(studentSubData);
	}

}
