package com.classroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroom.db.DBUtil;
import com.classroom.modal.StudentElective;

@Repository
public class StudentElectiveDao {

	@Autowired
	DBUtil dbUtil;

	public StudentElective save(StudentElective studentElective) {
		Connection conn = dbUtil.getConnection();
		String sql = "INSERT INTO cms.student_elective (usn,sub_id) VALUES (?, ?); ";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, studentElective.getUsn());
			statement.setString(2, studentElective.getSubID());
			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new USER was inserted successfully!");
				studentElective.setMessage("StudentElective has been added succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentElective;
	}

	public StudentElective findById(String studentElectivename) {
		Connection conn = dbUtil.getConnection();
		String sql = "SELECT usn,sub_id from cms.student_elective where sub_id='" + studentElectivename + "';";
		ResultSet rs;
		StudentElective studentElective = new StudentElective();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				studentElective.setUsn(rs.getString(1));
				studentElective.setSubID(rs.getString(2));
			} else {
				studentElective.setMessage("StudentElective Not Found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentElective;
	}

	public StudentElective update(StudentElective studentElective) {
		Connection conn = dbUtil.getConnection();
		String sql = "UPDATE cms.student_elective set  usn=? ,  subid=? where usn=?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, studentElective.getUsn());
			statement.setString(2, studentElective.getSubID());
			statement.setString(3, studentElective.getUsn());
			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new studentElective was inserted successfully!");
				studentElective.setMessage("StudentElective has been updated succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentElective;

	}

	public StudentElective deleteById(StudentElective studentElective) {
		Connection conn = dbUtil.getConnection();
		String sql = "DELETE from cms.student_elective where usn=?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, studentElective.getUsn());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new studentElective was inserted successfully!");
				studentElective = new StudentElective();
				studentElective.setMessage("StudentElective has been deleted succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentElective;

	}

}
