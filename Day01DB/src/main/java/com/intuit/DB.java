package com.intuit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
	public static void main(String[] args) throws Exception{
		Connection con = null;
		try {
			Class.forName("driver");
			con = DriverManager.getConnection("connection url","username","password");
			Statement stmt =  con.createStatement();
			String sql = "insert into persons(first_name,last_name,age) values('sam','thomas',12)";
			stmt.execute(sql);
			stmt.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}
		
	}
}
