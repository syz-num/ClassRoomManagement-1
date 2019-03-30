package com.classroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classroom.dao.AttendanceDao;
import com.classroom.modal.Attendance;

@Service
public class AttendenceService {

	@Autowired
	private AttendanceDao attendanceDao;

	public void saveAttendace(Attendance attendance) {
		attendanceDao.save(attendance);
	}

}
