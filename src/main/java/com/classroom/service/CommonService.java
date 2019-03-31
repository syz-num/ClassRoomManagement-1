package com.classroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroom.dao.LecturerDao;
import com.classroom.dao.StudentDao;
import com.classroom.dao.StudentSubDataDao;
import com.classroom.dao.SubjectDao;
import com.classroom.modal.Lecturer;
import com.classroom.modal.Student;
import com.classroom.modal.StudentSubData;

@Service
public class CommonService {

	@Autowired
	private LecturerDao lecturerDao;

	@Autowired
	private StudentDao studentDao;

	@Autowired
	private SubjectDao subjectDao;

	@Autowired
	private StudentSubDataDao studentSubDataDao;

	public List<String> findSubjectByLecturerId(String id) {
		return subjectDao.findSubjectByLecturerId(id);
	}

	public List<Student> findStudentsBySubId(String subId) {
		return studentDao.findBySubectId(subId);
	}

	public List<StudentSubData> findStudentSubDataByUSN(String usn) {
		return studentSubDataDao.findStudentSubDataByUSN(usn);
	}

}
