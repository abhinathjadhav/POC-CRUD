package org.poc.stored.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.poc.stored.models.User;

public class UserDao {

	private Connection connection;

	public UserDao() {
		connection = getConnection();
	}

	public List<User> getAllUsers() {
		return getAllUseres();
	}

	private List<User> getAllUseres() {
		String stm = "SELECT * FROM users";
		try {
			PreparedStatement ps =connection.prepareStatement(stm);
			ps.execute();
			ResultSet result = ps.getResultSet();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	Connection getConnection() {
		String sqlUser = "sqlserver";
		String sqlPassword = "vpiVQa78pLq4VtA";
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectURL = "jdbc:sqlserver://35.244.61.123:1433;encrypt=true;database=POC;integratedSecurity=true;";
			Connection conn = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Connect to database successful!!");
		return null;
	}
}
