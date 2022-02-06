package com.te.jdbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatch {
	public static void main(String[] args) {

		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String query = "insert into employee values(?,?,?)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root&password=root");
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, 12);
			preparedStatement.setString(2, "vinutha");
			preparedStatement.setString(3, "BALS");
			preparedStatement.addBatch();
			preparedStatement.setInt(1, 16);
			preparedStatement.setString(2, "vinutha1");
			preparedStatement.setString(3, "BALSqq");
			preparedStatement.addBatch();
			preparedStatement.addBatch();
			preparedStatement.setInt(1, 18);
			preparedStatement.setString(2, "vinutha2");
			preparedStatement.setString(3, "BALSqqbh");
			preparedStatement.addBatch();
			int[] res = preparedStatement.executeBatch();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
