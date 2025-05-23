package com.phoenix.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//business logic
public class UserAuthentication implements Connectivity
{
	public boolean checkUser(String user, String pass)
	{
		DatabaseConnectivity ref = new DatabaseConnectivity();
		PrintWriter out =res.getWriter();
		if(rs.next()==true)
		{
			out.println("valid user!");
		}else
		{
			out.println("invalid user!!");
		}
		return ref.isValid(user,pass);
		
	}

	@Override
	public boolean isValid(String user, String pass) {
		// TODO Auto-generated method stub
		return false;
	}
}
