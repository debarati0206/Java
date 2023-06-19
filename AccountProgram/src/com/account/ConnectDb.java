package com.account;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcURL = "";
		Connection con =null;
		try {
			//register driver class
			Class.forName("org.postgresql.Driver");
			con  = DriverManager.getConnection("jdbc:postgresql://localhost:5432/demo","postgres","Debarati@0206");
			if(con!=null) {
				System.out.println("Connection Ok!");
			}
			else {
				System.out.println("Connection failed!");
			}
		}
		catch(Exception e){
			
		}
	}

}
