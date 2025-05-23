package com.Nextgen.Backend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/test")
public class TestServlet extends HttpServlet
{ 
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException
	{
		List<String> names = new ArrayList();
		names.add("Michael");
		names.add("Lewis");	
		names.add("Senna");
		int SizeOfList=names.size();
		HttpSession sesh=req.getSession();
		sesh.setAttribute("data",names);
		res.sendRedirect("Index.jsp");
		sesh.setAttribute("size",SizeOfList);
	}
	
}
