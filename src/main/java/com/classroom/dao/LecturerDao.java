package com.classroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroom.db.DBUtil;
import com.classroom.modal.Lecturer;

@Repository
public class LecturerDao {

	@Autowired
	DBUtil dbUtil;

	public Lecturer save(Lecturer lecturer) {
		Connection conn = dbUtil.getConnection();
		String sql = "INSERT INTO CMS.lecturer (id, doj, email, f_name, m_name, l_name, gender, mobile_no) VALUES (?, ?, ?, ?, ?, ?, ?, ?); ";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, lecturer.getID());
			statement.setDate(2, new java.sql.Date(lecturer.getDOJ().getTime()));
			statement.setString(3, lecturer.geteMail());
			statement.setString(4, lecturer.getfName());
			statement.setString(5, lecturer.getmName());
			statement.setString(6, lecturer.getlName());
			statement.setString(7, lecturer.getGender());
			statement.setString(8, lecturer.getMobileNo());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				lecturer.setMessage("Lecturer has been added succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lecturer;
	}

	public Lecturer findById(String ID) {
		Connection conn = dbUtil.getConnection();
		String sql = "SELECT id, doj, email, f_name, m_name, l_name, gender, mobile_no from CMS.lecturer where id='"
				+ ID + "';";
		ResultSet rs;
		Lecturer lecturer = new Lecturer();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				lecturer.setID(rs.getString(1));
				lecturer.setDOJ(rs.getDate(2));
				lecturer.seteMail(rs.getString(3));
				lecturer.setfName(rs.getString(4));
				lecturer.setmName(rs.getString(5));
				lecturer.setlName(rs.getString(6));
				lecturer.setGender(rs.getString(7));
				lecturer.setMobileNo(rs.getString(8));

			} else {
				lecturer.setMessage("Lecturer Not Found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lecturer;
	}

	public Lecturer update(Lecturer lecturer) {
		Connection conn = dbUtil.getConnection();
		String sql = "UPDATE CMS.lecturer set  doj=?, email=?, f_name=?, m_name=?, l_name=?, gender=?, mobile_no=? where id=?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setDate(1, new java.sql.Date(lecturer.getDOJ().getTime()));
			statement.setString(2, lecturer.geteMail());
			statement.setString(3, lecturer.getfName());
			statement.setString(4, lecturer.getmName());
			statement.setString(5, lecturer.getlName());
			statement.setString(6, lecturer.getGender());
			statement.setString(7, lecturer.getMobileNo());
			statement.setString(8, lecturer.getID());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				lecturer.setMessage("Lecturer has been updated succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lecturer;

	}

	public Lecturer deleteById(Lecturer lecturer) {
		Connection conn = dbUtil.getConnection();
		String sql = "DELETE from CMS.lecturer where id= ?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, lecturer.getID());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				lecturer = new Lecturer();
				lecturer.setMessage("Lecturer has been deleted succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lecturer;

	}

}
