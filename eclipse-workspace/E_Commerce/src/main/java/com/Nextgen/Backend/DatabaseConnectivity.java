package com.Nextgen.Backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity implements Connectivity
{
	public boolean isValid(String user,String pass)
	{
		boolean status=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomdb", "root", "1234");
			System.out.println("DB Connected successfully.");
			
			String query="select * from users where username=? and password=?";
			PreparedStatement psmt= con.prepareStatement(query);
			psmt.setString(1,user);
			psmt.setString(2,pass);
			
			System.out.println("Checking for user: " + user + " with pass: " + pass);
			
			ResultSet rs=psmt.executeQuery();
			status=rs.next();
			
			System.out.println("Match found? " + status);
			
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return status;
	}
}
