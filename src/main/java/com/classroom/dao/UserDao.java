package com.classroom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.classroom.db.DBUtil;
import com.classroom.modal.User;

@Repository
public class UserDao {

	@Autowired
	DBUtil dbUtil;

	public User save(User user) {
		Connection conn = dbUtil.getConnection();
		String sql = "INSERT INTO CMS.users (username, password, role, email) VALUES (?, ?, ?, ?, ?); ";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getRole());
			statement.setString(4, user.getEmail());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				user.setMessage("User has been added succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public User findById(String username) {
		Connection conn = dbUtil.getConnection();
		String sql = "SELECT username, password, role, email from CMS.users where username='" + username + "';";
		ResultSet rs;
		User user = new User();
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			rs = statement.executeQuery(sql);
			if (rs.next()) {
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				user.setRole(rs.getString(3));
				user.setEmail(rs.getString(4));

			} else {
				user.setMessage("User Not Found.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public User update(User user) {
		Connection conn = dbUtil.getConnection();
		String sql = "UPDATE CMS.users set  password=? ,  role=? ,  email=? where username=?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);

			statement.setString(1, user.getPassword());
			statement.setString(2, user.getRole());
			statement.setString(3, user.getEmail());
			statement.setString(4, user.getUsername());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				user.setMessage("User has been updated succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;

	}

	public User deleteById(User user) {
		Connection conn = dbUtil.getConnection();
		String sql = "DELETE from CMS.users where username=?;";
		int rs;
		try {
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, user.getUsername());

			rs = statement.executeUpdate();
			if (rs > 0) {
				System.out.println("A new user was inserted successfully!");
				user = new User();
				user.setMessage("User has been deleted succesfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;

	}

}
