package com.classroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		String sql = "INSERT INTO cms.student (usn, dob, doj, e_mail, f_name, m_name, l_name, gender, mobile_no, sem,deptid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
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
			statement.setString(11, student.getDeptId());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				student.setMessage("Student has been added succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

	public Student findById(String USN) {
		Connection conn = dbUtil.getConnection();
		String sql = "SELECT usn, dob, doj, e_mail, f_name, m_name, l_name, gender, mobile_no, sem, deptid from cms.student where USN='"
				+ USN + "';";
		ResultSet rs;
		Student student = new Student();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				student.setUSN(rs.getString(1));
				student.setDOB(rs.getDate(2));
				student.setDOJ(rs.getDate(3));
				student.seteMail(rs.getString(4));
				student.setfName(rs.getString(5));
				student.setmName(rs.getString(6));
				student.setlName(rs.getString(7));
				student.setGender(rs.getString(8));
				student.setMobileNo(rs.getString(9));
				student.setSem(rs.getInt(10));
				student.setDeptId(rs.getString(11));

			} else {
				student.setMessage("Student Not Found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;
	}

	public List<Student> findBySubectId(String subId) {
		Connection conn = dbUtil.getConnection();
		String sql = "SELECT S.usn, S.dob, S.doj, S.e_mail, S.f_name, S.m_name, S.l_name, S.gender, S.mobile_no, S.sem, S.deptid,SB.sub_id from cms.student S,cms.subject SB where S.deptid=SB.deptid and S.sem=SB.sem and SB.sub_id='"
				+ subId + "';";
		ResultSet rs;
		List<Student> studentList = new ArrayList<Student>();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			while (rs.next()) {
				Student student = new Student();
				student.setUSN(rs.getString(1));
				student.setDOB(rs.getDate(2));
				student.setDOJ(rs.getDate(3));
				student.seteMail(rs.getString(4));
				student.setfName(rs.getString(5));
				student.setmName(rs.getString(6));
				student.setlName(rs.getString(7));
				student.setGender(rs.getString(8));
				student.setMobileNo(rs.getString(9));
				student.setSem(rs.getInt(10));
				student.setDeptId(rs.getString(11));
				student.setSubId(rs.getString(12));
				studentList.add(student);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

	public Student update(Student student) {
		Connection conn = dbUtil.getConnection();
		String sql = "UPDATE cms.student set dob=?, doj=?, e_mail=?, f_name=?, m_name=?, l_name=?, gender=?, mobile_no=?, sem=?,deptid=? where usn=?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setDate(1, new java.sql.Date(student.getDOB().getTime()));
			statement.setDate(2, new java.sql.Date(student.getDOJ().getTime()));
			statement.setString(3, student.geteMail());
			statement.setString(4, student.getfName());
			statement.setString(5, student.getmName());
			statement.setString(6, student.getlName());
			statement.setString(7, student.getGender());
			statement.setString(8, student.getMobileNo());
			statement.setInt(9, student.getSem());
			statement.setString(10, student.getDeptId());
			statement.setString(11, student.getUSN());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				student.setMessage("Student has been updated succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;

	}

	public Student deleteById(Student student) {
		Connection conn = dbUtil.getConnection();
		String sql = "DELETE from cms.student where usn=?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, student.getUSN());
			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				student = new Student();
				student.setMessage("Student has been deleted succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;

	}

}
