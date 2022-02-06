package com.te.jdbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DynamicQuery {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root&password=root");
			String query = "update employee set ename=? where eid=?";
			preparedStatement = connection.prepareStatement(query);
		//	preparedStatement.setInt(1, 33);
			preparedStatement.setString(1, "bhavya");
			preparedStatement.setInt(2, 1);
			preparedStatement.addBatch();
			
			
			
		//	preparedStatement.setString(3, "ballari");
			int result = preparedStatement.executeUpdate();
			if (result != 0) {
				System.out.println("Data is added successfully");

			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
