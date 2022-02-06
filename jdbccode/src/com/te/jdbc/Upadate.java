package com.te.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Upadate {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=root");
			statement = connection.createStatement();
			String query = "update studentdetail set sname='vin' where sid=1";
			int result = statement.executeUpdate(query);
			if (result != 0) {
				System.out.println("Data is updted successfully");
			} else {
				System.out.println("Data is not updated");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if (statement != null) {
					try {
						statement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}

				}
			}
		}

	}

}
