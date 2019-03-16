package com.classroom.db;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

@Repository
public class DBUtil {

	private Connection conn;

	@Qualifier("dataSource")
	@Autowired
	private DataSource dataSource;

	public Connection getConnection() {
		Connection conn = DataSourceUtils.getConnection(dataSource);
		return conn;

	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
}
