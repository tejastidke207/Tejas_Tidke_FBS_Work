//package com.Nextgen.Backend;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//
//@WebServlet("/product")
//public class ProductServlet extends HttpServlet
//{
//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
//	{
//		System.out.println("Connected");
//		HttpSession sesh = req.getSession(false);
//		PrintWriter out = res.getWriter();
//		if(sesh==null || sesh.getAttribute("user") == null))
//		{
//			out.println("You haven't logged in yet");
//			res.sendRedirect("Login.html");
//		}
//		else
//		{
//			out.println("You have logged in");
//		}
//	}
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
//	{
//		doGet(req,res);
//	}
//}
