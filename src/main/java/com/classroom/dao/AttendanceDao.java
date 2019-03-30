package com.classroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroom.db.DBUtil;
import com.classroom.modal.Attendance;
import com.classroom.modal.Student;

@Repository
public class AttendanceDao {

	@Autowired
	DBUtil dbUtil;

	public void save(Attendance attendace) {
		Connection conn = dbUtil.getConnection();
		String sql = "INSERT INTO cms.attendance ( usn, sub_id, sub_name,date, day_of_week,unit, is_lab) VALUES (?, ?, ?, ?, ?, ?, ?); ";
		String studentsql = "INSERT INTO cms.attendace (id, usn, sub_id, sub_name,date, day_of_week,unit, is_lab) VALUES (?, ?, ?, ?, ?, ?, ?); ";
		String subjectsql = "INSERT INTO cms.attendace (id, usn, sub_id, sub_name,date, day_of_week,unit, is_lab) VALUES (?, ?, ?, ?, ?, ?, ?); ";
		int rs;
		try {
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
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
