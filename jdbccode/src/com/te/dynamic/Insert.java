package com.te.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=root");
			String string = "insert into studentdetail values(?,?,?)";
			preparedStatement = connection.prepareStatement(string);
			preparedStatement.setInt(1, 12);
			preparedStatement.setString(2, "vinutha");
			preparedStatement.setString(3, "vin@gmail.com");
			preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
