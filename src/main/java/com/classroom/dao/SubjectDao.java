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
import com.classroom.modal.Subject;

@Repository
public class SubjectDao {

	@Autowired
	DBUtil dbUtil;

	public Subject save(Subject subject) {
		Connection conn = dbUtil.getConnection();
		String sql = "INSERT INTO cms.subject (sub_id, sub_name, lecturer_id, sem, is_elective, is_lab, credit, total_marks, course_stage, academic_year,deptid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); ";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, subject.getSubID());
			statement.setString(2, subject.getSubName());
			statement.setString(3, subject.getLectureID());
			statement.setInt(4, subject.getSem());
			statement.setString(5, subject.getIsElective());
			statement.setString(6, subject.getIsLab());
			statement.setInt(7, subject.getCredit());
			statement.setInt(8, subject.getTotalMarks());
			statement.setString(9, subject.getCourseStage());
			statement.setInt(10, subject.getAcademicYear());
			statement.setString(11, subject.getDeptId());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				subject.setMessage("Subject has been added succesfully.");
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
		return subject;
	}

	public Subject findById(String ID) {
		Connection conn = dbUtil.getConnection();
		String sql = "SELECT sub_id, sub_name, lecturer_id, sem, is_elective, is_lab, credit, total_marks, total_attendence, test1_attendence, test2_attendence, test3_attendence, course_stage, academic_year, deptid from cms.subject where sub_id='"
				+ ID + "';";
		ResultSet rs;
		Subject subject = new Subject();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				subject.setSubID(rs.getString(1));
				subject.setSubName(rs.getString(2));
				subject.setLectureID(rs.getString(3));
				subject.setSem(rs.getInt(4));
				subject.setIsElective(rs.getString(5));
				subject.setIsLab(rs.getString(6));
				subject.setCredit(rs.getInt(7));
				subject.setTotalMarks(rs.getInt(8));
				subject.setTotalAttendance(rs.getInt(9));
				subject.setTest1Attendance(rs.getFloat(10));
				subject.setTest2Attendance(rs.getFloat(11));
				subject.setTest3Attendance(rs.getFloat(12));
				subject.setCourseStage(rs.getString(13));
				subject.setAcademicYear(rs.getInt(14));
				subject.setDeptId(rs.getString(15));

			} else {
				subject.setMessage("Subject Not Found.");
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
		return subject;
	}

	public List<String> findSubjectByLecturerId(String ID) {
		Connection conn = dbUtil.getConnection();
		String sql = "SELECT sub_id from cms.subject where lecturer_id='" + ID + "';";
		ResultSet rs;
		List<String> list = new ArrayList<>();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				list.add(rs.getString(1));

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
		return list;
	}

	public Subject update(Subject subject) {
		Connection conn = dbUtil.getConnection();
		String sql = "UPDATE cms.subject set  sub_name= ?,  lecturer_id= ?,  sem= ?,  is_elective= ?,  is_lab= ?,  credit= ?,  total_marks= ?,  course_stage= ?,  academic_year= ?,deptid=?,test1_attendence=?,test2_attendence=?,test3_attendence=?,total_attendence =? where sub_id=?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, subject.getSubName());
			statement.setString(2, subject.getLectureID());
			statement.setInt(3, subject.getSem());
			statement.setString(4, subject.getIsElective());
			statement.setString(5, subject.getIsLab());
			statement.setInt(6, subject.getCredit());
			statement.setInt(7, subject.getTotalMarks());
			statement.setString(8, subject.getCourseStage());
			statement.setInt(9, subject.getAcademicYear());
			statement.setString(10, subject.getDeptId());
			statement.setFloat(11, subject.getTest1Attendance());
			statement.setFloat(12, subject.getTest2Attendance());
			statement.setFloat(13, subject.getTest3Attendance());
			statement.setFloat(14, subject.getTotalAttendance());
			statement.setString(15, subject.getSubID());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				subject.setMessage("Subject has been updated succesfully.");
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
		return subject;

	}

	public Subject deleteById(Subject subject) {
		Connection conn = dbUtil.getConnection();
		String sql = "DELETE from cms.subject where sub_id= ?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, subject.getSubID());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				subject = new Subject();
				subject.setMessage("Subject has been deleted succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return subject;

		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return subject;

	}
}
