package com.te.dynamic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner("System.in");
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?user=root&password=root");
			String string = "insert into studentdetail values(?,?,?)";
			System.out.println("Eneter name");
			String string2 = scanner.next();
			System.out.println("Enter email");
			String string3 = scanner.next();

			
			System.out.println("Enter id");
			int id = scanner.nextInt();
			
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, string2);
			preparedStatement.setString(3, string3);
			preparedStatement.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
