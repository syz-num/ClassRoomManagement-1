package com.classroom.service;

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
		return subjectDao.findById(subId).orElse(null);
	}

	public Subject updateSubject(Subject subject) {
		return subjectDao.save(subject);
	}

	public void deleteSubject(String subId) {
		subjectDao.deleteById(subId);
	}

}
