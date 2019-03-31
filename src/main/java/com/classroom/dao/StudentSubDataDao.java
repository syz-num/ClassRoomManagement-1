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
import com.classroom.modal.StudentSubData;

@Repository
public class StudentSubDataDao {

	@Autowired
	DBUtil dbUtil;

	public StudentSubData save(StudentSubData studentSubData) {
		Connection conn = dbUtil.getConnection();
		String sql = "INSERT INTO cms.studentSubData (usn,  sub_id) VALUES (?, ?); ";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, studentSubData.getUSN());
			statement.setString(2, studentSubData.getSubID());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new StudentSubData was inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentSubData;
	}

	public StudentSubData findById(String ID, String subId) {
		Connection conn = dbUtil.getConnection();
		String sql = "SELECT usn,  sub_id,  quiz1_marks,  quiz2_marks,  quiz3_marks,  requiz_marks, assignment_marks,  test1_marks,  test2_marks,  test3_marks,  avg_test_marks,  test1_attendence, test2_attendence, test3_attendence, total_attendence,  lab_internal_marks  from cms.studentSubData where sub_id='"
				+ ID + " and sub_id=" + subId + "';";
		ResultSet rs;
		StudentSubData studentSubData = new StudentSubData();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				studentSubData.setUSN(rs.getString(1));
				studentSubData.setSubID(rs.getString(2));
				studentSubData.setQuiz1Marks(rs.getFloat(3));
				studentSubData.setQuiz2Marks(rs.getFloat(4));
				studentSubData.setQuiz3Marks(rs.getFloat(5));
				studentSubData.setRequizMarks(rs.getFloat(6));
				studentSubData.setAssignmentMarks(rs.getFloat(7));
				studentSubData.setTest1Marks(rs.getFloat(8));
				studentSubData.setTest2Marks(rs.getFloat(9));
				studentSubData.setTest3Marks(rs.getFloat(10));
				studentSubData.setAvgTestMarks(rs.getFloat(11));
				studentSubData.setTest1Attendance(rs.getFloat(12));
				studentSubData.setTest2Attendance(rs.getFloat(13));
				studentSubData.setTest3Attendance(rs.getFloat(14));
				studentSubData.setTotalAttendence(rs.getFloat(15));
				studentSubData.setLabInternalMarks(rs.getFloat(16));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentSubData;
	}

	public List<String> findStudentSubDataBySubId(String subId) {
		Connection conn = dbUtil.getConnection();
		String sql = "SELECT sub_id from cms.studentSubData where sub_id='" + subId + "';";
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
		}
		return list;
	}

	public StudentSubData update(StudentSubData studentSubData) {
		Connection conn = dbUtil.getConnection();
		String sql = "UPDATE cms.studentSubData set quiz1_marks =?, quiz2_marks =?, quiz3_marks =?, requiz_marks, assignment_marks =?, test1_marks =?, test2_marks =?, test3_marks =?, avg_test_marks =?, test1_attendence, test2_attendence, test3_attendence, total_attendence =?, lab_internal_marks  where usn =? and sub_id =?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setFloat(1, studentSubData.getQuiz1Marks());
			statement.setFloat(2, studentSubData.getQuiz2Marks());
			statement.setFloat(3, studentSubData.getQuiz3Marks());
			statement.setFloat(4, studentSubData.getRequizMarks());
			statement.setFloat(5, studentSubData.getAssignmentMarks());
			statement.setFloat(6, studentSubData.getTest1Marks());
			statement.setFloat(7, studentSubData.getTest2Marks());
			statement.setFloat(8, studentSubData.getTest3Marks());
			statement.setFloat(9, studentSubData.getAvgTestMarks());
			statement.setFloat(10, studentSubData.getTest1Attendance());
			statement.setFloat(11, studentSubData.getTest2Attendance());
			statement.setFloat(12, studentSubData.getTest3Attendance());
			statement.setFloat(13, studentSubData.getTotalAttendence());
			statement.setFloat(14, studentSubData.getLabInternalMarks());
			statement.setString(15, studentSubData.getUSN());
			statement.setString(16, studentSubData.getSubID());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new StudentSubData was inserted successfully!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentSubData;

	}

	public StudentSubData deleteById(StudentSubData studentSubData) {
		Connection conn = dbUtil.getConnection();
		String sql = "DELETE from cms.studentSubData where sub_id= ?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, studentSubData.getSubID());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new StudentSubData was inserted successfully!");
				studentSubData = new StudentSubData();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return studentSubData;

		}
		return studentSubData;

	}
}
