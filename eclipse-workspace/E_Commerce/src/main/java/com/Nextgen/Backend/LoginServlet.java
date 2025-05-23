package com.Nextgen.Backend;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet 
{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {

        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        Authenticate auth = new Authenticate();

        if (auth.checkLogin(user, pass)) {
            // Start a session
            HttpSession session = req.getSession();
            session.setAttribute("user", user);

            // Redirect to products.html
            res.sendRedirect("Products.html");

        } else {
            PrintWriter out = res.getWriter();
            out.println("/<h3>Invalid Username or Password</h3>");
            res.sendRedirect("Login.html");
        }
    }
}