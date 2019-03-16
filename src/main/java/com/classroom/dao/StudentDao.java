package com.classroom.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroom.db.DBUtil;
import com.classroom.modal.Student;

@Repository
public class StudentDao {

	@Autowired
	DBUtil dbUtil;

	public Student save(Student student) {
		Connection conn = dbUtil.getConnection();
		String sql = "INSERT INTO CMS.student (usn, dob, doj, e_mail, f_name, m_name, l_name, gender, mobile_no, sem) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, student.getUSN());
			statement.setDate(2, new java.sql.Date(student.getDOB().getTime()));
			statement.setDate(3, new java.sql.Date(student.getDOJ().getTime()));
			statement.setString(4, student.geteMail());
			statement.setString(5, student.getfName());
			statement.setString(6, student.getmName());
			statement.setString(7, student.getlName());
			statement.setString(8, student.getGender());
			statement.setString(9, student.getMobileNo());
			statement.setInt(10, student.getSem());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Object findById(String uSN) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student update(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(String uSN) {
		// TODO Auto-generated method stub

	}

}
