package com.classroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroom.db.DBUtil;
import com.classroom.modal.Attendance;
import com.classroom.modal.Student;
import com.classroom.modal.StudentSubData;
import com.classroom.modal.Subject;

@Repository
public class AttendanceDao {

	@Autowired
	DBUtil dbUtil;

	@Autowired
	StudentSubDataDao studentSubDataDao;

	@Autowired
	SubjectDao subjectDao;

	public void save(Attendance attendace) {
		Connection conn = dbUtil.getConnection();
		String sql = "INSERT INTO cms.attendance ( usn, sub_id, sub_name,date, day_of_week,unit, is_lab) VALUES (?, ?, ?, ?, ?, ?, ?); ";
		int rs;
		try {
			Subject subject = subjectDao.findById(attendace.getSubID());
			if (attendace.getCourseStage().equals("TEST1")) {
				subject.setTest1Attendance(subject.getTest1Attendance() + attendace.getUnit());
			}
			if (attendace.getCourseStage().equals("TEST2")) {
				subject.setTest2Attendance(subject.getTest2Attendance() + attendace.getUnit());
			}
			if (attendace.getCourseStage().equals("TEST3")) {
				subject.setTest2Attendance(subject.getTest2Attendance() + attendace.getUnit());
			}
			subject.setCourseStage(attendace.getCourseStage());
			subject.setTotalAttendance(
					subject.getTest1Attendance() + subject.getTest2Attendance() + subject.getTest3Attendance());
			subject.setCourseStage(attendace.getCourseStage());
			subjectDao.update(subject);

			for (Student student : attendace.getStudents()) {
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, student.getUSN());
				statement.setString(2, attendace.getSubID());
				statement.setString(3, attendace.getSubName());
				statement.setDate(4, new java.sql.Date(attendace.getDate().getTime()));
				statement.setString(5, attendace.getDayOfWeek());
				statement.setInt(6, attendace.getUnit());
				statement.setString(7, attendace.getIsLab());
				rs = statement.executeUpdate();
				StudentSubData studentSubData = studentSubDataDao.findById(student.getUSN(), attendace.getSubID());
				if (attendace.getCourseStage().equals("TEST1")) {
					studentSubData.setTest1Attendance(studentSubData.getTest1Attendance() + attendace.getUnit());
				}
				if (attendace.getCourseStage().equals("TEST2")) {
					studentSubData.setTest2Attendance(studentSubData.getTest2Attendance() + attendace.getUnit());
				}
				if (attendace.getCourseStage().equals("TEST3")) {
					studentSubData.setTest2Attendance(studentSubData.getTest2Attendance() + attendace.getUnit());
				}
				studentSubData.setTotalAttendance(studentSubData.getTest1Attendance()
						+ studentSubData.getTest2Attendance() + studentSubData.getTest3Attendance());
				studentSubDataDao.update(studentSubData);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
