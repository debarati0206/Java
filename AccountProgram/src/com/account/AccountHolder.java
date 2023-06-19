package com.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:postgresql://localhost:5432/demo";
		String username = "postgres";
		String password = "Debarati@0206";
		try {
			Connection conn = DriverManager.getConnection(jdbcURL,username,password);
			if(conn!=null) {
				System.out.println("Connection Ok!");
			}
			else {
				System.out.println("Connection failed!");
			}
//			String s = "insert into accounts"+ " values(3,'Ravi',20000)";
//			Statement statement = conn.createStatement();
//			int rows = statement.executeUpdate(s);
//			if(rows>0) {
//				System.out.println("Row inserted!");
//			}
			
			
			
//			String s = "insert into accounts"+ " values(?, ?, ?)";
//			PreparedStatement statement = conn.prepareStatement(s);
//			statement.setInt(1, 4);
//			statement.setString(2, "John");
//			statement.setInt(3, 21000);
//			int rows = statement.executeUpdate(); //dont need to pass 's' through this in case of preparedstatement.
//			if(rows>0) {
//				System.out.println("Row inserted!");
//			}
			
			String s = "update accounts set name = 'Thomas' where id =3";
			PreparedStatement statement = conn.prepareStatement(s);
			int rows = statement.executeUpdate(); //dont need to pass 's' through this in case of preparedstatement.
//			if(rows>0) {
//				System.out.println("Row inserted!");
//			}
			
			conn.close();
		}
		catch(SQLException e) {
			System.out.println("error occured!"+ e);
		}
	}

}
