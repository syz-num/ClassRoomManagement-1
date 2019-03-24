package com.classroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroom.dao.SubjectDao;
import com.classroom.modal.Subject;

@Service
public class SubjectService {
	@Autowired
	private SubjectDao subjectDao;

	public Subject createSubject(Subject subject) {
		return subjectDao.save(subject);
	}

	public Subject getSubjectById(String subId) {
		return subjectDao.findById(subId);
	}

	public List<String> getSubjectByLecturerId(String lectureId) {
		return subjectDao.findSubjectByLecturerId(lectureId);
	}

	public Subject updateSubject(Subject subject) {
		return subjectDao.update(subject);
	}

	public Subject deleteSubject(Subject subject) {
		return subjectDao.deleteById(subject);
	}

}
