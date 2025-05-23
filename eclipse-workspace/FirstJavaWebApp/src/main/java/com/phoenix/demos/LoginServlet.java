package com.phoenix.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/authenticate")//this is known as URL pattern
public class LoginServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		System.out.println("on server side");
		String user=req.getParameter("username");
		String pass=req.getParameter("password");
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketdb","root","1234");
				String query="select * from players where id=? and runs_scored=?";
				PreparedStatement pstmt =con.prepareStatement(query);
				pstmt.setString(1,user);
				pstmt.setString(2,pass);
				ResultSet rs= pstmt.executeQuery();
				PrintWriter out =res.getWriter();
				if(rs.next()==true)
				{
					out.println("valid user!");
				}else
				{
					out.println("invalid user!!");
				}
				out = res.getWriter();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}	
