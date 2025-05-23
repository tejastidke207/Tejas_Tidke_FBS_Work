package com.phoenix.demos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseConnectivity implements Connectivity
{
	//data persistence components
	public boolean isValid(String user,String pass)
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdb",user,pass);
		PreparedStatement pstmt =con.prepareStatement(query);
		pstmt.setString(1,user);
		pstmt.setString(2,pass);
		ResultSet rs= pstmt.executeQuery();
		return true;
	}
}
